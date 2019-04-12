package cn.gaoyuan.demo.designpattern.factory.absfactory.color;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:56
 * @desc
 */
public class RedColor implements Color {
    @Override
    public void fill() {
        System.out.println("fill->RedColor");
    }
}
