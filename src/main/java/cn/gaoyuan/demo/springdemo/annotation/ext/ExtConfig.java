package cn.gaoyuan.demo.springdemo.annotation.ext;

import cn.gaoyuan.demo.springdemo.annotation.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 15:48
 * @desc
 */
@Configuration
@ComponentScan("cn.gaoyuan.demo.springdemo.annotation.ext")
public class ExtConfig {

    @Bean
    public Blue blue() {
        return new Blue();
    }

}
