package cn.gaoyuan.demo.springdemo.annotation.bean;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 14:42
 * @desc
 */
public class Car {

    public Car() {
        System.out.println("car construtor");
    }

    public void init() {
        System.out.println("car init");
    }

    public void destory() {
        System.out.println("car destroy");
    }
}
