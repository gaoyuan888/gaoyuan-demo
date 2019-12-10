package cn.gaoyuan.demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/12/10 17:51
 * @desc
 */
class MyDatas {
    private static int status = 1;
    Lock lock = new ReentrantLock();
    Condition c = lock.newCondition();
    Condition c1 = lock.newCondition();

    public void printSingle(){
        lock.lock();
        try{
            while(status%2 == 0){
                c.await();
            }
            System.out.print(status+" ");
            status++;
            c1.signal();
        }catch(Exception e){
        }finally{
            lock.unlock();
        }
    }

    public void printDouble(){
        lock.lock();
        try{
            while(status%2 == 1){
                c1.await();
            }
            System.out.print(status+" ");
            status++;
            c.signal();
        }catch(Exception e){
        }finally{
            lock.unlock();
        }
    }

}


public class Test111 {

    public static void main(String[] args) {
        MyDatas myDatas = new MyDatas();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    myDatas.printDouble();
                } catch (Exception e) {

                }
            }
        }).start();


        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    myDatas.printSingle();
                } catch (Exception e) {

                }
            }
        }).start();
    }
}
