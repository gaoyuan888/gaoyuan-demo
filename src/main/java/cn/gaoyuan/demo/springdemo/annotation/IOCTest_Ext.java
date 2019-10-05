package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 15:58
 * @desc
 */
public class IOCTest_Ext {
    @Test
    public void test() {

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        configApplicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {

        });


        configApplicationContext.close();

    }
}
