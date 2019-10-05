package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.tx.TxConfig;
import cn.gaoyuan.demo.springdemo.annotation.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 11:17
 * @desc
 */
public class IOCTest_Tx {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService ser = configApplicationContext.getBean(UserService.class);
        ser.insert();

        configApplicationContext.close();
    }
}
