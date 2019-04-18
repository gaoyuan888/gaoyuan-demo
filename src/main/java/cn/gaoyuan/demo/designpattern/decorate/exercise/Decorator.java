package cn.gaoyuan.demo.designpattern.decorate.exercise;

/**
 * 功能描述:基类
 *
 * @author yaoyizhou
 * @date 2019/4/18 20:30
 * @desc
 */
public class Decorator implements Cake {

    public Cake cake;

    public Decorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String flaver() {
        return cake.flaver();
    }
}
