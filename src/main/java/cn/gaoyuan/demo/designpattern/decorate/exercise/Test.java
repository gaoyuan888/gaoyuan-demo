package cn.gaoyuan.demo.designpattern.decorate.exercise;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:41
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        Cake cake=new ConcreteCakeDecorator(new PotatoCake());
        System.out.println(cake.flaver());
    }
}
