package cn.gaoyuan.demo.qa.jvmparams;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/16 12:49
 * @desc
 */
public class ExceptionDemo {


    /**
     * java.lang.StackOverflowError
     * <p>
     * 虚拟机栈
     */
    public static void test1() {
        test1();
    }

    /**
     * java.lang.OutOfMemoryError
     * 堆
     */
    public static void test2() {
        Byte[] bytes = new Byte[1 * 1024 * 1024 * 1500];
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

//        java.lang.StackOverflowError
//        test1();

//        java.lang.OutOfMemoryError
//        test2();

    }

}
