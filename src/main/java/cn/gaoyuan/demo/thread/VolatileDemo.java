package cn.gaoyuan.demo.thread;

import java.util.concurrent.*;

class Student {
    volatile int age = 0;

    public void addage() {
        this.age = 2;
    }
}

/**
 * vilatile 可见性
 */
public class VolatileDemo {
    public final int count = 0;
    public static int threadTotal = 2;
    public static int clienttotal = 500;


    public static void main(String[] args) throws Exception {
        Student sd = new Student();
        ExecutorService threadService = Executors.newCachedThreadPool();
        threadService.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                sd.addage();
            } catch (Exception e) {

            }
        });

        while (sd.age == 0) {

        }

        System.out.println(sd.age);

        threadService.shutdown();
    }

    public static void add() {
    }

}
