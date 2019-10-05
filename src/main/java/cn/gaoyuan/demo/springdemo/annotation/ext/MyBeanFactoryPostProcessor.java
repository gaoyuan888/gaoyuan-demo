package cn.gaoyuan.demo.springdemo.annotation.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 15:52
 * @desc
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor ->postProcessBeanFactory");

        int c = beanFactory.getBeanDefinitionCount();
        System.out.println("MyBeanFactoryPostProcessor->bean的数量:" + c);
        String[] nam = beanFactory.getBeanDefinitionNames();

        System.out.println(Arrays.toString(nam));

    }
}
