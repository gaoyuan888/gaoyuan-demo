package cn.gaoyuan.demo.qa.jvmparams;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/16 19:37
 * @desc
 */
public class RunTimeDemo {

    public static void main(String[] args) {
        Long ss=1254L;
        System.out.println(ss.intValue());


        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
//        java.lang.OutOfMemoryError: Java heap space
        byte[] bytes=new byte[1024*1024*1500];
        System.out.println("good 11111");
        bytes.toString();
    }
}
