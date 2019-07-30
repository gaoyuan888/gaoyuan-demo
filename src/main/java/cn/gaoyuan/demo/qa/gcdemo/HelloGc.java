package cn.gaoyuan.demo.qa.gcdemo;

import java.util.Random;

/**
 * 功能描述:
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialGC (DefNew + Tenured)
 *   UseSerialOldGC  理论上知道即可，实际已经被优化了
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialOldGC (DefNew + Tenured)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParNewGC (ParNew + Tenured)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelGC (PSYoungGen + ParOldGen)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelOldGC (PSYoungGen + ParOldGen)
 * 不加就是默认的 UseParallelGC
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags                       (PSYoungGen + ParOldGen)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseConcMarkSweepGC (par new generation + concurrent )
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseG1GC (单独讲)
 *
 * @author yaoyizhou
 * @date 2019/7/29 19:30
 * @desc
 */
public class HelloGc {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("******HelloGc");

        String str = "gaoyuan*****";
        try {
            while (true) {
                str += str + new Random().nextInt(1111111) + new Random().nextInt(2222222);
                str.intern();
            }


        } catch (Exception e) {

        }


//        Thread.sleep(Integer.MAX_VALUE);

    }

}
