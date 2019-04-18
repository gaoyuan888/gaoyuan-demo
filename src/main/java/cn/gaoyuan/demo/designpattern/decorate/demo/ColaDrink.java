package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:10
 * @desc
 */
public class ColaDrink implements Drink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public double price() {
        return 1.00;
    }
}
