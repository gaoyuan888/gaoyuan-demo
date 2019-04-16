package cn.gaoyuan.demo.designpattern.builder.demo5;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:43
 * @desc
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new BottlePacking();
    }

    @Override
    public abstract float price();
}
