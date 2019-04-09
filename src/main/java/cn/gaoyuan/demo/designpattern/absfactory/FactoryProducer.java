package cn.gaoyuan.demo.designpattern.absfactory;

import cn.gaoyuan.demo.designpattern.absfactory.factory.AbstractFactory;
import cn.gaoyuan.demo.designpattern.absfactory.factory.ColorFactory;
import cn.gaoyuan.demo.designpattern.absfactory.factory.ShapeFactory;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/9 21:03
 * @desc
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
