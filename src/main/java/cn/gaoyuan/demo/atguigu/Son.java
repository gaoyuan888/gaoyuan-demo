package cn.gaoyuan.demo.atguigu;

/**
 * 功能描述:
 *5132 10 6 8 7
 * @author yaoyizhou
 * @date 2019/10/22 10:59
 * @desc
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.println("(6)");
    }

    Son() {
        super();//写或不写都存在
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    private int test() {
        System.out.println("(9)");
        return 1;
    }

    private static int method() {
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }


}
