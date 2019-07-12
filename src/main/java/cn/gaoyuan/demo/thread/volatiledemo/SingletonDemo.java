package cn.gaoyuan.demo.thread.volatiledemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 功能描述:
 * 单利模式双端检索案例考点
 * <p>
 * DCL(双端检索)机制不一定线程安全，原因是指令重排序的存在【加入volatile 可以禁止指令重排序】
 * <p>
 * 原因在于：某一个线程执行到第一次检测，读取到的instance不为null,instance的引用对象可能【没有初始化】
 * instance=new SingletonDemo();可以分为如下三步完成（伪代码）
 * memory=allocate();1.分配对象内存空间
 * instance(memory);2.初始化对象
 * instance=memory;3.设置instance指向刚分配的内存地址，此时instance!=null
 * <p>
 * 步骤2和步骤3不存在数据依赖关系，而且无论是否重排还是重拍后程序的执行结果在单线程中并没有改变。因此这种重排优化是允许的。
 * memory=allocate();1.分配对象内存空间
 * instance=memory;【3.设置instance指向刚分配的内存地址，此时instance!=null】
 * instance(memory);【2.初始化对象】
 * <p>
 * 当步骤2和步骤3重排序后,若经过线程1 执行到了
 * =================instance=memory;【3.设置instance指向刚分配的内存地址，此时instance!=null】
 * 此时instance!=null 则直接返或instance 而此时 还没有执行
 * ==================instance(memory);【2.初始化对象】
 * 则返或的对象地址实际是null,造成并发问题。
 * <p>
 * 解决这个问题的方法是加上volatile关键字，禁止SingletonDemo指令重排序
 *
 * @author yaoyizhou
 * @date 2019/7/12 16:35
 * @desc
 */
public class SingletonDemo {
    public static void main(String[] args) {

    }

    private static SingletonDemo instance = null;

    private SingletonDemo() {
        System.out.println("初始化单例");
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {  //句子1
            synchronized (SingletonDemo.class) { //句子2
                if (instance == null) { //句子3
                    instance = new SingletonDemo();//句子4
                }
            }
        }
        return instance;
    }

}
