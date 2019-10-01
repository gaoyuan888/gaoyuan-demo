package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 14:48
 * @desc
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("创建完成");
        applicationContext.getBean("car");
        applicationContext.close();
    }
}
