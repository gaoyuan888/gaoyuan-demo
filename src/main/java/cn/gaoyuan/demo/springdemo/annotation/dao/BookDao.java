package cn.gaoyuan.demo.springdemo.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 10:24
 * @desc
 */
@Repository
public class BookDao {

    private String lable;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
