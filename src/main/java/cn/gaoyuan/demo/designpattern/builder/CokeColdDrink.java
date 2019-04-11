package cn.gaoyuan.demo.designpattern.builder;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:54
 * @desc
 */
public class CokeColdDrink extends ColdDrink {
    @Override
    public String name() {
        return "CokeColdDrink coldDrink";
    }

    @Override
    public float price() {
        return 10.8f;
    }
}
