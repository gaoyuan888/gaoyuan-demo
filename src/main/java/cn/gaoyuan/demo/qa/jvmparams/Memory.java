package cn.gaoyuan.demo.qa.jvmparams;

/**
 * 功能描述:
 * <p>
 * 确定内存区域
 *
 * @author yaoyizhou
 * @date 2019/8/16 13:44
 * @desc
 */
public class Memory {

    public static void main(String[] args) {
        Byte[] byts = new Byte[1 * 1024 * 1024];
        byts.toString();

        int i = 1;
        Object o = new Object();
        Memory memory = new Memory();

    }

    private void foo(Object o) {
        //这里会生成一个字符串对象
        String str = o.toString();
        System.out.println(str);

    }

}
