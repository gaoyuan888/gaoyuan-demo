package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.bean.Person;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 9:49
 * @desc
 */
public class MainTest {

    public static void main(String[] args) {
        //配置开发
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
