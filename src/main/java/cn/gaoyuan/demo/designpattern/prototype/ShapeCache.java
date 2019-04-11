package cn.gaoyuan.demo.designpattern.prototype;

import java.util.Hashtable;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 18:04
 * @desc
 */
public class ShapeCache {

    private static Hashtable<String, Shap> shapeMap = new Hashtable<>();

    public static Shap getShap(String shapeId) {
        Shap catchShap = shapeMap.get(shapeId);
        return (Shap) catchShap.clone();
    }

}
