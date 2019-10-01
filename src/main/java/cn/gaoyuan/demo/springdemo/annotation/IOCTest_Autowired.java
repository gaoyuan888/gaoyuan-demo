package cn.gaoyuan.demo.springdemo.annotation;

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
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bean = context.getBean(BookService.class);

        System.out.println(bean);

        BookDao bean1 = context.getBean(BookDao.class);
        System.out.println(bean1);


    }
}
