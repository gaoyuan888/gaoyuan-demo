package cn.gaoyuan.demo.springdemo.annotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 20:47
 * @desc
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    //容器中发布此事件以后，方法触发
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到的事件：" + event);
    }
}
