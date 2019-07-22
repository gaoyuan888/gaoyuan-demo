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

public class ConditionDemo {
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    public void printa() {
        lock.lock();
        try {
            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("a");
                }
            }, "AA").start();
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }


    }

    public void printb() {
        for (int i = 0; i < 10; i++) {
            System.out.println("b");
        }
    }

    public void printc() {
        for (int i = 0; i < 15; i++) {
            System.out.println("c");
        }
    }


    public static void main(String[] args) {


    }


}
