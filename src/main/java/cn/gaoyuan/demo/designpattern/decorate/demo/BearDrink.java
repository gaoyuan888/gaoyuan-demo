package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 19:56
 * @desc
 */
public class BearDrink implements Drink {

    @Override
    public String name() {
        return "啤酒";
    }

    @Override
    public double price() {
        return 2.00;
    }
}
