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

        Shap shap = ShapeCache.getShap("1");
        System.out.println(shap.getType());

        Shap shap2 = ShapeCache.getShap("2");
        System.out.println(shap2.getType());

        Shap shap3 = ShapeCache.getShap("3");
        System.out.println(shap3.getType());


    }
}
