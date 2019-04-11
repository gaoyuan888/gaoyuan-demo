package cn.gaoyuan.demo.designpattern.prototype;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 18:11
 * @desc
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShap("1");
        System.out.println(shape.getType());

        Shape shape2 = ShapeCache.getShap("2");
        System.out.println(shape2.getType());

        Shape shape3 = ShapeCache.getShap("3");
        System.out.println(shape3.getType());


    }
}
