package cn.gaoyuan.demo.designpattern.builder.demo5;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:30
 * @desc
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
