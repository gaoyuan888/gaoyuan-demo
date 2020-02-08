package cn.gaoyuan.demo.atguigu;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Myshare5 {
    private int statis = 0;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    public void print1() throws Exception {
        lock.lock();
        try {
            while (statis == 1) {
                c1.await();
            }
            statis=1;
            System.out.print(statis);
            c1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print2()throws Exception  {
        lock.lock();
        try {
            while (statis != 1) {
                c1.await();
            }
            statis=2;
            System.out.print(statis);
            c1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}


/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/24 0:35
 * @desc
 */
public class ThreadDemo4 {

    public static void main(String[] args) {

        Myshare5 myshare5 = new Myshare5();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    myshare5.print1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    myshare5.print2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
