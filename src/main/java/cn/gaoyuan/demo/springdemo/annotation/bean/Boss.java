package cn.gaoyuan.demo.springdemo.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/3 16:46
 * @desc
 */
@Component
public class Boss {

    private Car car;

    @Autowired
    public Boss(Car car) {
        this.car = car;
        System.out.println("boss的有参构造器");
    }

    public Car getCar() {
        return car;
    }

//    @Autowired //标注在方法上，Spring容器创建对象，就会调用方法，完成赋值
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
