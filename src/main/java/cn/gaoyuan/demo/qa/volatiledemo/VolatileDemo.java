package cn.gaoyuan.demo.qa.volatiledemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Student {
    volatile int age = 0;

    public void addage() {
        this.age = 2;
    }

    //此时，age 是加了volatile修饰的，volatile不保证原子性
    public void addPlusPlus() {
        age++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAtomicInt() {
        atomicInteger.getAndIncrement();
    }

}

/**
 * 1.验证vilatile 保证可见性
 * 1.1 例如 int num =0; num 变量之前根本没有添加volatile 关键字修饰，没有可见性
 * 1.2 添加了volatile 可以解决可见性问题
 * 2.验证volatile不保证原子性
 * 2.1 原子性指的是什么意思？ 不可可分割，完整性，也既某个线程正在做的具体业务，中间不可以被分割或者加塞，需要完整，要么同时成功，要么同时失败。
 * 2.2 volatile 不保证原子性的案例演示
 * 2.3 why
 * 2.4 如何解决?
 *     *synchronized
 *     * 使用juc下面的atomicInteger
 */
public class VolatileDemo {

    public static void main(String[] args) throws Exception {
        Student sd = new Student();
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(20);
        for (int i = 1; i <= 20; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 1000; j++) {
                    sd.addPlusPlus();
                    sd.addAtomicInt();
                }
                countDownLatch.countDown();
            });
        }
//        需要等待上面20个线程都计算完成后，在用main线程取得最终结果值看是多少
        countDownLatch.await();
        System.out.println(sd.age);
        System.out.println(sd.atomicInteger);
        executorService.shutdown();
    }


    //volatile保证可见性，及时通知其他线程，主物理内存的值已经被修改。
    public static void seeOkByVolatile() {
        Student sd = new Student();
        ExecutorService threadService = Executors.newCachedThreadPool();
        threadService.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                sd.addage();

            } catch (Exception e) {

            }
        });

        threadService.execute(() -> {
            while (sd.age == 0) {

            }
            System.out.println(sd.age);
        });
    }

}

