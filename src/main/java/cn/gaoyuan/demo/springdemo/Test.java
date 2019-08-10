package cn.gaoyuan.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/31 13:55
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring.xml");
        GService service = (GService) context.getBean("service");
        service.service();
    }
}
