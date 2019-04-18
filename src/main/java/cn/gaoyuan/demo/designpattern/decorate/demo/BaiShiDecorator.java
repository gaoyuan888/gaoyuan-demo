package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:11
 * @desc
 */
public class BaiShiDecorator extends Decorator {
    public BaiShiDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void method() {

    }

    @Override
    public String name() {
        return "百事" + drink.name();
    }

    @Override
    public double price() {
        return drink.price() + 1.00;
    }
}
