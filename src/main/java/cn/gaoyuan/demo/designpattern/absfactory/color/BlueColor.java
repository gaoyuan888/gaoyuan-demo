package cn.gaoyuan.demo.designpattern.absfactory.color;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:57
 * @desc
 */
public class BlueColor implements Color {
    @Override
    public void fill() {
        System.out.println("fill->BlueColor");
    }
}
