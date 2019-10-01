package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 14:07
 * @desc
 */
//创建一个spring 定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        System.out.println("create bean getObject");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }


    //true 这个bean是单例，在容器中保存一份
    //false 多实例bean,每次都会创建一个bean,
    @Override
    public boolean isSingleton() {
        return true;
    }
}
