package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.bean.Person;
import cn.gaoyuan.demo.springdemo.annotation.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * 功能描述: 配置类就是配置文件
 *
 * @author yaoyizhou
 * @date 2019/10/1 9:58
 * @desc
 */
@Configuration


@ComponentScans(value = {
        @ComponentScan(value = "cn.gaoyuan.demo.springdemo.annotation", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                 @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                 @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})}


                , useDefaultFilters = false)

})

//ANNOTATION 注解
//ASSIGNABLE_TYPE 按照给定的类型
//CUSTOM 自定义规则
public class MainConfig {

    //给容器中注册一个bean,类型为返回值类型，id默认为使用方法名
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }
}
