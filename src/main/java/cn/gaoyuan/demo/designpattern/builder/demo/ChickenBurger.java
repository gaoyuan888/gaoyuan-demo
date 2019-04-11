package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:50
 * @desc
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
