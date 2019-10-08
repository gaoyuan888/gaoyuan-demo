package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.aop.LogAspects;
import cn.gaoyuan.demo.springdemo.annotation.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/4 9:14
 * @desc
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAop {


    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
