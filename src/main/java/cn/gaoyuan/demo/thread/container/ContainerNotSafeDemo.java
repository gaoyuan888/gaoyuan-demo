package cn.gaoyuan.demo.thread.container;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 集合类线程安全问题
 */
public class ContainerNotSafeDemo {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            });
        }

    }
}
