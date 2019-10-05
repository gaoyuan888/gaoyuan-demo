package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.aop.MathCalculator;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/4 9:46
 * @desc
 */
public class IOCTest_AOP {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        //1.
        MathCalculator mathCalculator = configApplicationContext.getBean(MathCalculator.class);
        mathCalculator.div(4, 1);


        configApplicationContext.close();

    }
}
