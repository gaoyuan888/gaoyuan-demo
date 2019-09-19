package cn.gaoyuan.demo.springdemo.demo1;

import cn.gaoyuan.demo.springdemo.GService;
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
        BeanDemo service = (BeanDemo) context.getBean("beanDemo");
//        service.service();
    }
}
