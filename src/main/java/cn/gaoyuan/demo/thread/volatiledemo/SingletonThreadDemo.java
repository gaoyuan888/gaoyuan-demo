package cn.gaoyuan.demo.thread.volatiledemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/12 17:11
 * @desc
 */
public class SingletonThreadDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(100);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    SingletonDemo.getInstance();
                    semaphore.release();
                } catch (Exception E) {

                }

            });
        }
        executorService.shutdown();

    }

    private static SingletonThreadDemo instance = null;

    private SingletonThreadDemo() {
        System.out.println("单利模式");
    }

    public static SingletonThreadDemo getInstance() {
        if (instance == null) {
            instance = new SingletonThreadDemo();
        }
        return instance;
    }
}
