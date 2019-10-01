package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 15:59
 * @desc
 */
@Component
public class Cat implements InitializingBean,DisposableBean {

    public Cat() {
        System.out.println("cat Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat  【DisposableBean】  destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat  【InitializingBean】 afterPropertiesSet");
    }
}
