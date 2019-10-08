package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 12:51
 * @desc
 */

@Component
public class Red implements EmbeddedValueResolverAware, ApplicationContextAware, BeanNameAware {
    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
        System.out.println("传入的IOC容器：" + applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("当前bean的名字：" + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name} 我是#{20*2}");
        System.out.println("新解析的字符串：" + s);
    }
}
