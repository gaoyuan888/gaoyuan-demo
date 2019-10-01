package cn.gaoyuan.demo.springdemo.annotation.service;

import cn.gaoyuan.demo.springdemo.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 10:24
 * @desc
 */
@Service
public class BookService {

    @Qualifier("bookDao")
    @Autowired(required = false)
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
