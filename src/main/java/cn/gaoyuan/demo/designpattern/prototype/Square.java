package cn.gaoyuan.demo.designpattern.prototype;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 18:01
 * @desc
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square->draw");
    }
}
