package cn.gaoyuan.demo.qa.prodconsumer;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyshareResource {
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private volatile Integer num = 0;

    public void consumer() {
        lock.lock();
        try {
            //判断
            while (num == 0) {
                c1.await();
            }
            //干活
            num--;
            System.out.println(Thread.currentThread().getName() + ":" + num);
            //通知
            c2.signalAll();
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }

    public void product() {
        lock.lock();
        try {
            //判断
            while (num != 0) {
                c2.await();
            }
            //干活
            num++;
            System.out.println(Thread.currentThread().getName() + ":" + num);
            //通知
            c1.signalAll();
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
 * @date 2019/7/23 17:54
 * @desc
 */
public class DemoTest {

    public static void main(String[] args) {

        MyshareResource mr = new MyshareResource();

        new Thread(() -> {
            while (true) {
                mr.product();
            }
        }, "product").start();

        new Thread(() -> {
            while (true) {
                mr.consumer();
            }
        }, "consumer").start();
    }
}
