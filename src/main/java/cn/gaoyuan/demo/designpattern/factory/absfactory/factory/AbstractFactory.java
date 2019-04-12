package cn.gaoyuan.demo.designpattern.factory.absfactory.factory;

import cn.gaoyuan.demo.designpattern.factory.absfactory.color.Color;
import cn.gaoyuan.demo.designpattern.factory.absfactory.shap.Shap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 21:00
 * @desc
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shap getShape(String shap);
}
