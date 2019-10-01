package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 14:36
 * @desc
 */
@Configuration
@ComponentScan("cn.gaoyuan.demo.springdemo.annotation.bean")
public class MainConfigOfLifeCycle {


    //@Scope("prototype") 多实例bean在容器关闭的时候 不会调用销毁方法
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Car car() {
        return new Car();
    }
}
