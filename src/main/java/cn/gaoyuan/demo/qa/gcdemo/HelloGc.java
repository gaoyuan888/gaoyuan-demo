package cn.gaoyuan.demo.qa.gcdemo;

/**
 * 功能描述:
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseSerialGC (DefNew + Tenured)
 * 理论上知道即可，实际已经被优化了
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseSerialOldGC (DefNew + Tenured)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseParNewGC (ParNew + Tenured)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseParallelGC (PSYoungGen + ParOldGen)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseParallelOldGC (PSYoungGen + ParOldGen)
 * 不加就是默认的 UseParallelGC
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags                       (PSYoungGen + ParOldGen)
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseConMarkSweepGC (par new generation + concurrent )
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:PrintCommandLineFlags -XX:+UseG1GC (单独讲)
 *
 * @author yaoyizhou
 * @date 2019/7/29 19:30
 * @desc
 */
public class HelloGc {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("******HelloGc");

        String ss = "atguigu*****";
        try {

        } catch (Exception e) {

        }


        Thread.sleep(Integer.MAX_VALUE);

    }

}
