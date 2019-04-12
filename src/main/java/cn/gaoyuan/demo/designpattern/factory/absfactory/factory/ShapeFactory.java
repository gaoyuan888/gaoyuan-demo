package cn.gaoyuan.demo.designpattern.factory.absfactory.factory;

import cn.gaoyuan.demo.designpattern.factory.absfactory.color.Color;
import cn.gaoyuan.demo.designpattern.factory.absfactory.shap.CircleShap;
import cn.gaoyuan.demo.designpattern.factory.absfactory.shap.RectangleShap;
import cn.gaoyuan.demo.designpattern.factory.absfactory.shap.Shap;
import cn.gaoyuan.demo.designpattern.factory.absfactory.shap.SquareShap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 21:01
 * @desc
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shap getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleShap();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleShap();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new SquareShap();
        }

        return null;
    }
}
