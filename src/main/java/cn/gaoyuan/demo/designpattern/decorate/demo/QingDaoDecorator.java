package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:这是一个具体的装饰者
 *
 * @author yaoyizhou
 * @date 2019/4/18 19:50
 * @desc
 */
public class QingDaoDecorator extends Decorator {
    public QingDaoDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void method() {
        return;
    }

    @Override
    public double price() {
        return drink.price() + 4.0;
    }

    @Override
    public String name() {
        return "青岛" + drink.name();
    }
}
