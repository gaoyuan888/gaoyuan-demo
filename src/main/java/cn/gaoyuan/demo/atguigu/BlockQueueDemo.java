package cn.gaoyuan.demo.atguigu;

import org.apache.commons.lang.StringUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyResource {
    private volatile boolean FLAG = true;//默认开启，进行生产+消费
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public MyResource(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void myProduct() throws Exception {
        String data = null;
        boolean reValue;
        while (FLAG) {
            data = atomicInteger.incrementAndGet() + "";
            reValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (reValue) {
                System.out.println(Thread.currentThread().getName() + "插入成功");
            } else {
                System.out.println(Thread.currentThread().getName() + "插入失败");
            }
        }
        System.out.println(Thread.currentThread().getName() + "线程叫停");
    }

    public void myConsumer() throws Exception {
        String data = null;
        while (FLAG) {
            data = blockingQueue.poll(2L, TimeUnit.SECONDS);
            if (StringUtils.isBlank(data)) {
                FLAG=false;
                System.out.println(Thread.currentThread().getName() + "超过两秒，消费失败");
                return;
            }
            System.out.println(Thread.currentThread().getName() + "线程成功");
        }
    }

}


/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/23 19:35
 * @desc
 */
public class BlockQueueDemo {
    public static void main(String[] args) {
        MyResource myResource=new MyResource(new ArrayBlockingQueue<String>(10));
        new Thread(()->{
            try {
                myResource.myProduct();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"AA").start();

        new Thread(()->{
            try {
                myResource.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"BB").start();
    }
}
