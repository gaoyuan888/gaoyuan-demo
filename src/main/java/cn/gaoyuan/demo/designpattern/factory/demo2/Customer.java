package cn.gaoyuan.demo.designpattern.factory.demo2;

/**
 * 功能描述:静态工厂
 *
 * @author yaoyizhou
 * @date 2019/4/15 20:05
 * @desc
 */
public class Customer {
    public static void main(String[] args) {
        TrunkFactory.produceTrunk("宝马").run();
        TrunkFactory.produceTrunk("奥迪").run();
    }
}
