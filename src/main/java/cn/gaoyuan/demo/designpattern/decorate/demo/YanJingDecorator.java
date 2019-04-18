package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:04
 * @desc
 */
public class YanJingDecorator extends Decorator {
    public YanJingDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void method() {

    }

    @Override
    public String name() {
        return "燕京" + drink.name();
    }

    @Override
    public double price() {
        return drink.price() + 4.00;
    }
}
