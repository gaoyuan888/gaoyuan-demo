package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.bean.Color;
import cn.gaoyuan.demo.springdemo.annotation.bean.ColorFactoryBean;
import cn.gaoyuan.demo.springdemo.annotation.bean.Person;
import cn.gaoyuan.demo.springdemo.annotation.bean.Red;
import cn.gaoyuan.demo.springdemo.annotation.condition.LinuxCondition;
import cn.gaoyuan.demo.springdemo.annotation.condition.MyImportSelector;
import cn.gaoyuan.demo.springdemo.annotation.condition.WindowCondition;
import org.springframework.context.annotation.*;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 11:19
 * @desc
 */
@Configuration
//满足当前条件，这个类中配置的所有bean注册情况
@Conditional({WindowCondition.class})
@Import({Color.class, Red.class, MyImportSelector.class})
public class MainConfig2 {

    @Bean
//    @Scope("prototype")
//    懒加载是在getBean时候创建
    @Lazy
    public Person person() {
        System.out.println("bean");
        return new Person("wangwu", 32);
    }


    @Bean("bill")
    public Person person01() {
        return new Person("bill gates", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person person02() {
        return new Person("linux", 23);
    }

    /**
     * 容器中注册组件的方式
     * 1.包扫描+注解(自己写的类可以这种方式 @Controller @Service @Repository @Component)
     * 2.@Bean （第三方包中的组件）
     * 3.@Import[快速给容器导入一个组件]
     * 1)@Import
     * 2)ImportSelector
     * 3)ImportBeanDefinitionRegister
     * 4.Spring 提供的FactoryBean
     */


    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
