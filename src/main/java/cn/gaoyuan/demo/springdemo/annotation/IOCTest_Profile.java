package cn.gaoyuan.demo.springdemo.annotation;

import cn.gaoyuan.demo.springdemo.annotation.bean.Yellow;
import cn.gaoyuan.demo.springdemo.annotation.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/3 21:17
 * @desc
 */
public class IOCTest_Profile {

    @Test
    public void test01() {
//        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);


        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.getEnvironment().setActiveProfiles("testEnv");
        configApplicationContext.register(MainConfigOfProfile.class);
        configApplicationContext.refresh();


        String[] names = configApplicationContext.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }

        Yellow yell = configApplicationContext.getBean(Yellow.class);
        System.out.println(yell);


        configApplicationContext.close();


    }
}
