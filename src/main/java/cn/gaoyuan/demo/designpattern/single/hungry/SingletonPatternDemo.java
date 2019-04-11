package cn.gaoyuan.demo.designpattern.single.hungry;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/10 14:05
 * @desc
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
