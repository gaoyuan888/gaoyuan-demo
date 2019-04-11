package cn.gaoyuan.demo.designpattern.builder;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:56
 * @desc
 */
public class PepsiColdDrink extends ColdDrink {
    @Override
    public String name() {
        return "PepsiColdDrink coldDrink";
    }

    @Override
    public float price() {
        return 30.4f;
    }
}
