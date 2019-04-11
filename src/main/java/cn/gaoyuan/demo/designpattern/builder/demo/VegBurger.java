package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:48
 * @desc
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
