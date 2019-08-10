package cn.gaoyuan.demo.qa.lockdemo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/29 16:04
 * @desc
 */
public class SpinLockDemo {

    AtomicReference<Thread> atomicInteger = new AtomicReference();

    private void lock() {
        Thread thread = Thread.currentThread();
        System.out.println("lock name:"+thread.getName());
        while (!atomicInteger.compareAndSet(null, thread)) {

        }
    }

    private void unlock() {
        Thread thread = Thread.currentThread();
        System.out.println("unlock name:"+thread.getName());
        atomicInteger.compareAndSet(thread, null);

    }

    public static void main(String[] args) {
        SpinLockDemo demo = new SpinLockDemo();
        new Thread(() -> {
            try {
                demo.lock();
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            } catch (Exception e) {

            } finally {
                demo.unlock();
            }
        }, "AAA").start();


        new Thread(() -> {
            try {
                demo.lock();
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            } catch (Exception e) {

            } finally {
                demo.unlock();
            }
        }, "BBB").start();

    }

}
