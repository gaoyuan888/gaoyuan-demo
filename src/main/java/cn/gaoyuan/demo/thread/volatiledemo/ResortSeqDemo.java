package cn.gaoyuan.demo.thread.volatiledemo;

/**
 * 功能描述: 编译器指令重排序造成的问题，method2打印可能是1也可能是2
 *
 * @author yaoyizhou
 * @date 2019/7/11 20:01
 * @desc
 */
public class ResortSeqDemo {

    int a = 0;
    boolean flag = false;

    /**
     * 编译器优化，语句1 和语句2 存在指令重排序问题
     */
    public void method1() {
        //语句1
        a = 1;
        //语句2
        flag = true;
    }

    /**
     * 多线程环境中县城交替执行，由于编译器优化重排序的存在，
     * 两个线程中使用的变量能否保证一致性是无法确定的，打印的结果无法预测
     */
    public void method2() {
        if (flag) {
            a = a + 5;
            System.out.println(a);
        }
    }

}
