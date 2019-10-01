package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.bean.Person;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 21:19
 * @desc
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext configApplicationContext
            = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);


    @Test
    public void test() {

        printBeans(configApplicationContext);
        //1.创建ioc容器
        System.out.println("创建容器完成。。。");

        Person person = (Person) configApplicationContext.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = configApplicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);


        configApplicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
