package cn.gaoyuan.demo.designpattern.factory.absfactory.color;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:57
 * @desc
 */
public class GreenColor implements Color {
    @Override
    public void fill() {
        System.out.println("fill->GreenColor");
    }
}
