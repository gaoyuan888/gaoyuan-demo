package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 21:53
 * @desc
 */
@Configuration
@ComponentScan({"cn.gaoyuan.demo.springdemo.annotation.service", "cn.gaoyuan.demo.springdemo.annotation.controller", "cn.gaoyuan.demo.springdemo.annotation.dao"})
public class MainConfigOfAutowired {


//    @Primary
    @Bean("bookDao2")
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }

}

