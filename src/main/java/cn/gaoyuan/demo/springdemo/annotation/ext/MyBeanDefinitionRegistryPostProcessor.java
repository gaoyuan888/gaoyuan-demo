package cn.gaoyuan.demo.springdemo.annotation.ext;

import cn.gaoyuan.demo.springdemo.annotation.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 20:12
 * @desc
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override

//    BeanDefinitionRegistry bean定义的信息的保存中心， 以后beanFactory就是按照BeanDefinitionRegistry 里面保存的每一个bean定义信息创建bean实例
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor->postProcessBeanDefinitionRegistry->bean数量：" + registry.getBeanDefinitionCount());


        //给容器注册一个bean
//        BeanDefinition definition = new RootBeanDefinition(Blue.class);
        AbstractBeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
        registry.registerBeanDefinition("hello", definition);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor->postProcessBeanFactory->bean的数量：" + beanFactory.getBeanDefinitionCount());


    }
}
