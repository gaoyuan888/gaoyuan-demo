package cn.gaoyuan.demo.atguigu;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws Exception {
        lock.lock();
        try {
            //判断
            while (number != 0) {
                //等待，不生产
                condition.await();
            }
            //干活
            number++;
            System.out.println(Thread.currentThread().getName() + "/" + number);
            //通知唤醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void decrement() throws Exception {
        lock.lock();
        try {
            //判断
            while (number == 0) {
                //等待，不生产
                condition.await();
            }
            //干活
            number--;
            System.out.println(Thread.currentThread().getName() + "/" + number);
            //通知唤醒
            condition.signalAll();
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
 * @date 2019/10/23 19:18
 * @desc
 */
public class TranditionDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "BB").start();
    }
}
