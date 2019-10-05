package cn.gaoyuan.demo.springdemo.annotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 10:44
 * @desc
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insert() {
        userDao.insert();
        System.out.println("插入完成");
        int i = 10 / 0;
    }
}
