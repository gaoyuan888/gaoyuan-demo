package cn.gaoyuan.demo.designpattern.single.hungry;

/**
 * 功能描述:创建一个 Singleton1 类。
 *
 * @author yaoyizhou
 * @date 2019/4/10 13:52
 * @desc
 */
public class SingleObject {
    //创建一个实例
    private static SingleObject instance = new SingleObject();

    //让构造函数为private的，这样就不能被new出来
    private SingleObject() {
    }

    //获取唯一可利用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello world!");
    }
}
