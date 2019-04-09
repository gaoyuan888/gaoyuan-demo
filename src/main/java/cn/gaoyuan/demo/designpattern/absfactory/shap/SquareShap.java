package cn.gaoyuan.demo.designpattern.absfactory.shap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 20:54
 * @desc
 */
public class SquareShap implements Shap {
    @Override
    public void draw() {
        System.out.println("draw->SquareShap");
    }
}
