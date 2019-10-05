package cn.gaoyuan.demo.springdemo.annotation.bean;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 12:47
 * @desc
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
