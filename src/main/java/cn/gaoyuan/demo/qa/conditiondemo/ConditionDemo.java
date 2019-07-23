package cn.gaoyuan.demo.qa.conditiondemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述:
 * 题目：多线程之间按照顺序调用，实现 a->b->c三个线程启动，要求如下：
 * aa 打印5次，bb打印10次，cc打印15次
 * 紧接着
 * aaa 打印5次，bb打印10次，cc打印15次
 * ...
 * 来10轮
 *
 * @author yaoyizhou
 * @date 2019/7/18 20:40
 * @desc
 */

class Myshare {
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();
    public volatile Integer number = 0;

    public void print5() {
        lock.lock();
        try {
            //判断
            while (number != 0) {
                c1.await();
            }
            //干活
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            number = 1;
            //唤醒
            c2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print10() {
        lock.lock();
        try {
            //判断
            while (number != 1) {
                c2.await();
            }
            //干活
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            number = 2;
            //唤醒
            c3.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();
        try {
            //判断
            while (number != 2) {
                c3.await();
            }
            //干活
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            number = 0;
            //唤醒
            c1.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


public class ConditionDemo {
    public static void main(String[] args) {
        Myshare myshare = new Myshare();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myshare.print5();
            }
        }, "AA").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myshare.print10();
            }
        }, "BB").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myshare.print15();
            }
        }, "CC").start();
    }


}
