package cn.gaoyuan.demo.designpattern.decorate.exercise;

/**
 * 功能描述:具体装饰类
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:32
 * @desc 具体装饰者继承基类装饰者对基本产品进行装饰
 */
public class ConcreteCakeDecorator extends Decorator {

    public ConcreteCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String flaver() {
        return "番茄味"+cake.flaver();
    }
}
