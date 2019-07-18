package cn.gaoyuan.demo.qa.prodconsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData {
    private int number;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws Exception {
        lock.lock();
        try {
            //判断
            while (number != 0) {
                //等待，不能生产
                condition.await();
            }
            //干活
            number++;
            System.out.println(Thread.currentThread().getName() + "number:" + number);
            //通知唤醒
            condition.signalAll();
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws Exception {
        lock.lock();
        try {
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "number:" + number);
            condition.signalAll();

        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }
}

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/18 20:20
 * @desc
 */
public class ProdConsumer_TraditionDemo {


    public static void main(String[] args) {
        ShareData demo = new ShareData();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    demo.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    demo.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "BB").start();


        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    demo.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "CC").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    demo.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "DD").start();
    }

}
