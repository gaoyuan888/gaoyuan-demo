package cn.gaoyuan.demo.springdemo.annotation.bean;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 13:17
 * @desc
 */
public class Blue {

    public Blue() {
        System.out.println("blue  constructor");
    }

    public void init() {
        System.out.println("blue init");
    }

    public void destory() {
        System.out.println("blue destory");
    }
}
