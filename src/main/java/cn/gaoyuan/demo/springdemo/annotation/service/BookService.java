package cn.gaoyuan.demo.springdemo.annotation.service;

import cn.gaoyuan.demo.springdemo.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 10:24
 * @desc
 */
@Service
public class BookService {

    //    这里按照名称指定装配的bean，bean的注入是从MainConfig和@Repository中注入的（参考bean的注入方式）
//    @Qualifier("bookDao2")
//    @Autowired
    @Resource
    private BookDao bookDao2;

    public void print() {
        System.out.println(bookDao2);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao2 +
                '}';
    }
}
