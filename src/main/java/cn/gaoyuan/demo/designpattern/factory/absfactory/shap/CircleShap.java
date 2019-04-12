package cn.gaoyuan.demo.designpattern.factory.absfactory.shap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:55
 * @desc
 */
public class CircleShap implements Shap {
    @Override
    public void draw() {
        System.out.println("draw->CircleShap");
    }
}
