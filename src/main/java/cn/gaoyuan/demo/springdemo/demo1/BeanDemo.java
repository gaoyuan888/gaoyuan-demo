package cn.gaoyuan.demo.springdemo.demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/9/18 11:40
 * @desc
 */
public class BeanDemo implements BeanNameAware, BeanFactoryAware, BeanPostProcessor {

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
