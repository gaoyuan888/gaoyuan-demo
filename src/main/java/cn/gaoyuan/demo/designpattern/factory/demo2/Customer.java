package cn.gaoyuan.demo.designpattern.factory.demo2;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/15 20:34
 * @desc
 */
public class Customer {
    public static void main(String[] args) {
        TrunkFactory bwm=new BwmTrunkFactory();
        bwm.produceTrunk().run();

        TrunkFactory aodi=new AodiTrunkFactory();
        aodi.produceTrunk().run();

        TrunkFactory dz=new DzTrunkFactory();
        dz.produceTrunk().run();
    }
}
