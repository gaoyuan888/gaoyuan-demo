package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.bean.Blue;
import cn.gaoyuan.demo.springdemo.annotation.bean.Person;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfig;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 10:27
 * @desc
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext
            = new AnnotationConfigApplicationContext(MainConfig2.class);


    @Test
    public void testImport() {
        printBeans(applicationContext);
        Blue bean = applicationContext.getBean(Blue.class);
        System.out.println(bean);

        //这里看似是ColorFactoryBean 其实获取的是Color
        Object obj1 = applicationContext.getBean("colorFactoryBean");
        Object obj2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean 类型" + obj1.getClass());
        System.out.println(obj1 == obj2);
        //如果想获取ColorFactoryBean 则
        Object obj3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(obj3);

    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    //    测试condition
    @Test
    public void test03() {
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("os.name"));


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==========================");
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }


    //测试bean作用域
    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MainConfig2.class);

        System.out.println("ioc 容器创建");
        //默认是单实例的
        Object person = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person == person2);

    }

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
