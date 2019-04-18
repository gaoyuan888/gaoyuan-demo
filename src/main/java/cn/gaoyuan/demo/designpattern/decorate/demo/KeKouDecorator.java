package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:15
 * @desc
 */
public class KeKouDecorator extends Decorator {
    public KeKouDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void method() {

    }


    @Override
    public String name() {
        return "可口"+drink.name();
    }

    @Override
    public double price() {
        return drink.price()+2.00;
    }
}
