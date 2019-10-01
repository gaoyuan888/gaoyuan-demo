package cn.gaoyuan.demo.springdemo.annotation.controller;

import cn.gaoyuan.demo.springdemo.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 10:24
 * @desc
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;


}
