package cn.gaoyuan.demo.springdemo.annotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 21:30
 * @desc
 */
@Service
public class UserService {

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event) {
        System.out.println("UserService->监听事件：" + event);

    }

}
