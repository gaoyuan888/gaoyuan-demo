package cn.gaoyuan.demo.designpattern.prototype.demo2;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 17:59
 * @desc
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle->draw");
    }
}
