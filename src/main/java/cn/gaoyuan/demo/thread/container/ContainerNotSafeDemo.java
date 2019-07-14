package cn.gaoyuan.demo.thread.container;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 集合类线程安全问题
 */
public class ContainerNotSafeDemo {

    public static void main(String[] args) {
//       listNotSafe();

        List<String> list = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 300; i++) {
            executorService.execute(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            });
        }
    }

    public static void listNotSafe(){
        List<String> list = new CopyOnWriteArrayList<>();//Collections.synchronizedList(new ArrayList<>());//new Vector<>(); // new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 300; i++) {
            executorService.execute(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            });
        }
//      java.util.ConcurrentModificationException
        /**
         * 1。故障
         *    java.util.ConcurrentModificationException
         * 2.导致原因
         *   并发争抢修改导致，参考我们的花名册签名情况。
         *   一个人正在写，另外一个同学过来抢夺，导致数据不一致的异常，并发修改异常。
         * 3.解决方案
         *   3.1 new Vector<>();
         *   3.2 Collections.synchronizedList(new ArrayList<>());
         *   3.3 new CopyOnWriteArrayList<>();
         *       写时复制-->读写分离思想
         *
         *
         * 4.优化建议（同样的错误不犯第二次）
         */


    }
}
