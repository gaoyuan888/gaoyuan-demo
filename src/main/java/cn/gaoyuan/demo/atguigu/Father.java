package cn.gaoyuan.demo.atguigu;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/22 10:57
 * @desc
 */
public class Father {

    private int i = test();
    static {
        System.out.println("(1)");
    }
    private static int j = method();


    Father() {
        System.out.println("(2)");
    }

    {
        System.out.println("(3)");
    }

    private int test() {
        System.out.println("(4)");
        return 1;
    }

    private static int method() {
        System.out.println("(5)");
        return 1;
    }

}
