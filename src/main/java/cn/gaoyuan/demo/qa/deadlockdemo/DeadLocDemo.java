package cn.gaoyuan.demo.qa.deadlockdemo;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLock implements Runnable {
    private Lock lock = new ReentrantLock();
    private String lockA;
    private String lockB;

    public DeadLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lockA) {
                System.out.println(Thread.currentThread().getName() + "持有线程" + lockA + ",尝试获取线程" + lockB);
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName() + "持有线程" + lockB + ",尝试获取线程" + lockA);
                }
            }
        }

    }
}

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/24 9:43
 * @desc
 */
public class DeadLocDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        DeadLock locka = new DeadLock(lockA, lockB);
        DeadLock lockb = new DeadLock(lockB, lockA);

        new Thread(locka).start();
        new Thread(lockb).start();
    }
}
