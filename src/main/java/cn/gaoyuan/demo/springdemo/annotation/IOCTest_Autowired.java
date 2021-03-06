package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.bean.Boss;
import cn.gaoyuan.demo.springdemo.annotation.bean.Car;
import cn.gaoyuan.demo.springdemo.annotation.bean.Color;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfigOfAutowired;
import cn.gaoyuan.demo.springdemo.annotation.dao.BookDao;
import cn.gaoyuan.demo.springdemo.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 22:03
 * @desc
 */
public class IOCTest_Autowired {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        System.out.println("测试的ioc容器：" + context);

        Boss bean = context.getBean(Boss.class);
        System.out.println(bean);

        Car bean1 = context.getBean(Car.class);
        System.out.println(bean1);

        Color bean2 = context.getBean(Color.class);
        System.out.println(bean2);
        context.close();


    }

    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bean = context.getBean(BookService.class);

        System.out.println(bean);
        BookDao bean1 = (BookDao) context.getBean("bookDao");
        System.out.println(bean1);


    }
}
