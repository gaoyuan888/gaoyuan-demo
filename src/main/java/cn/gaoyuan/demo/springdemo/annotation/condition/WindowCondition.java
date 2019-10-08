package cn.gaoyuan.demo.springdemo.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 12:19
 * @desc
 */
public class WindowCondition implements Condition {

    /**
     * @param conditionContext      判断条件上下文环境
     * @param annotatedTypeMetadata 注释信息
     * @return
     */

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //是否是linux 系统
        //1.获取ioc 容器的bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        //2.获取类加载器
        ClassLoader classLoader = context.getClassLoader();

        //3.获取环境
        Environment environment = context.getEnvironment();


        //4.获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        //判断容器中的bean注册情况，也可以给容器中注册bean
        boolean f = registry.containsBeanDefinition("person");
        System.out.println(f);
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }

        return false;
    }
}
