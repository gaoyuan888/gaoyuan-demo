package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:装饰器抽象类（基类）
 *
 * @author yaoyizhou
 * @date 2019/4/18 19:43
 * @desc
 */
public abstract class Decorator implements Drink {

    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    //这里 abstract 的时候 ，类上面必须加上 abstract
    public abstract void method();

    @Override
    public String name() {
        return drink.name();
    }

    @Override
    public double price() {
        return drink.price();
    }

}
