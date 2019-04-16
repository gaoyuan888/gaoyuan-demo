package cn.gaoyuan.demo.designpattern.builder.demo5;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:39
 * @desc
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new WrapperPacking();
    }

    @Override
    public abstract float price();

}
