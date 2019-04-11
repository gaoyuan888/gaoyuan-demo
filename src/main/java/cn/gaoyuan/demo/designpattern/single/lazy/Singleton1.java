package cn.gaoyuan.demo.designpattern.single.lazy;

/**
 * 功能描述: 懒汉式1
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 *
 * @author yaoyizhou
 * @date 2019/4/10 14:08
 * @desc 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }


}
