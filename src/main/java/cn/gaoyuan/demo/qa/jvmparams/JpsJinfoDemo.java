package cn.gaoyuan.demo.qa.jvmparams;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/24 19:14
 * @desc
 */
public class JpsJinfoDemo {

    public static void main(String[] args) {
        try {
            //返回java虚拟机中的内存总量
            long totalMemory = Runtime.getRuntime().totalMemory();
            System.out.println(totalMemory / 1024 / 1024);
            //返回java虚拟机中试图使用的最大内存量
            long maxMemory = Runtime.getRuntime().maxMemory();
            System.out.println(maxMemory / 1024 / 1024);

            System.out.println("*****hello world****");
            Thread.sleep(Integer.MAX_VALUE);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
