package cn.gaoyuan.demo.qa.prodconsumer;


import org.apache.commons.lang.StringUtils;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyShare {
    private volatile Boolean FLAG = true;

    private BlockingDeque<String> blockingDeque = null;

    private AtomicInteger atomicInteger = new AtomicInteger();

    public MyShare(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    public void consume() {
        //判断
        String result = "";
        while (FLAG) {
            try {
                result = blockingDeque.poll(10, TimeUnit.SECONDS);
                if (StringUtils.isBlank(result)) {
                    FLAG = false;
                    System.out.println(Thread.currentThread().getName() + "消费失败:" + result);
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "消费成功:" + result);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void product() {
        //判断
        Boolean result = null;
        while (FLAG) {
            try {
                String s = atomicInteger.getAndIncrement() + "";
                result = blockingDeque.offer(s, 10, TimeUnit.SECONDS);
                if (result) {
                    System.out.println(Thread.currentThread().getName() + "生产成功：" + s);
                } else {
                    System.out.println(Thread.currentThread().getName() + "生产失败");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/23 19:20
 * @desc
 */
public class BlockQune_ProdConsumer {


    public static void main(String[] args) {
        final MyShare myShare = new MyShare(new LinkedBlockingDeque<String>(3));
        new Thread(() -> {
            myShare.consume();
        }, "consumer").start();


        new Thread(() -> {
            myShare.product();
        }, "prouduct").start();
    }

}
