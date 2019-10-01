package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 16:35
 * @desc
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor】postProcessBeforeInitialization->bean:" + beanName + "=>" + bean);
        return bean;

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor】postProcessAfterInitialization->bean:" + beanName + "=>" + bean);
        return bean;
    }
}
