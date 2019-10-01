package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 16:08
 * @desc
 */
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("dog constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("[@PostConstruct]...dog.....constructor....");
    }

    @PreDestroy
    public void destory() {
        System.out.println("[@PreDestroy]...dog...destory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
