package cn.gaoyuan.demo.designpattern.single.dcl;

/**
 * 功能描述:双检锁/双重校验锁（DCL，即 double-checked locking）
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 *
 * @author yaoyizhou
 * @date 2019/4/11 14:13
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 * 注意！！！！
 *     双重检查锁定背后的理论是完美的。不幸地是，现实完全不同。
 *     双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。
 *     双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java 平台内存模型。
 *     内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。
 * ---------------------
 * 作者：记忆力不好
 * 来源：CSDN
 * 原文：https://blog.csdn.net/chenchaofuck1/article/details/51702129
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 *
 */
public class Singleton {
    private volatile static Singleton instence;

    private Singleton() {
    }

    public static Singleton getInstence() {
        if (instence == null) {
            synchronized (Singleton.class) {
                if (instence == null) {
                    instence = new Singleton();
                }
            }
        }
        return instence;
    }
}
