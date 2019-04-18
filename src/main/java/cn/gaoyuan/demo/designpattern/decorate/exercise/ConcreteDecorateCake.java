package cn.gaoyuan.demo.designpattern.decorate.exercise;

/**
 * 功能描述:具体装饰类
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:32
 * @desc
 */
public class ConcreteDecorateCake extends Decorator {

    public ConcreteDecorateCake(Cake cake) {
        super(cake);
    }

    @Override
    public String flaver() {
        return "番茄味"+cake.flaver();
    }
}
