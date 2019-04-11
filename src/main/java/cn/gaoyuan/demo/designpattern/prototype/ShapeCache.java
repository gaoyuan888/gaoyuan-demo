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

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
