package cn.gaoyuan.demo.springdemo.annotation.condition;

import cn.gaoyuan.demo.springdemo.annotation.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 13:25
 * @desc
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry               bean定义的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("cn.gaoyuan.demo.springdemo.annotation.bean.Red");
        boolean blue = registry.containsBeanDefinition("cn.gaoyuan.demo.springdemo.annotation.bean.Blue");

        if (red && blue) {
            //指定bean名称
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个bean
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
