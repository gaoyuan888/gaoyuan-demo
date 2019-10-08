package cn.gaoyuan.demo.qa.prodconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/9/25 20:10
 * @desc
 */
class MyShare1 {
    private BlockingDeque<Integer> blockingDeque = null;
    AtomicInteger a = new AtomicInteger();


    public MyShare1(BlockingDeque<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    public void cunsum() throws Exception {
        while (true) {
            try {
                Integer poll = blockingDeque.poll(5, TimeUnit.SECONDS);
                if (poll > 0) {
                    System.out.println("消费成功");
                }
            } catch (Exception e) {
                System.out.println("消费失败");

            }

        }
    }

    public void product() throws Exception {
        while (true) {
            int andAdd = a.getAndAdd(1);
            boolean offer = blockingDeque.offer(andAdd, 5, TimeUnit.SECONDS);
            if (offer) {
                System.out.println("生产成功");
            }
        }
    }

}


public class BlockQueueSimple {
}
