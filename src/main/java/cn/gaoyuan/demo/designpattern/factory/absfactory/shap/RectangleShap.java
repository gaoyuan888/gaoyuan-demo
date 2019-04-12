package cn.gaoyuan.demo.designpattern.factory.absfactory.shap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:53
 * @desc
 */
public class RectangleShap implements Shap {
    @Override
    public void draw() {
        System.out.println("draw->RectangleShap");
    }
}
