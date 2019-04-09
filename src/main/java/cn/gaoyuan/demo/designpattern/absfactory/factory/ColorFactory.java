package cn.gaoyuan.demo.designpattern.absfactory.factory;

import cn.gaoyuan.demo.designpattern.absfactory.color.BlueColor;
import cn.gaoyuan.demo.designpattern.absfactory.color.Color;
import cn.gaoyuan.demo.designpattern.absfactory.color.GreenColor;
import cn.gaoyuan.demo.designpattern.absfactory.color.RedColor;
import cn.gaoyuan.demo.designpattern.absfactory.shap.Shap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 21:02
 * @desc
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new RedColor();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new GreenColor();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new BlueColor();
        }
        return null;
    }

    @Override
    public Shap getShape(String shap) {
        return null;
    }
}
