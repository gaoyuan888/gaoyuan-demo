package cn.gaoyuan.demo.designpattern.prototype;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 18:02
 * @desc
 */
public class Circle extends Shap {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle->draw");
    }
}
