package cn.gaoyuan.demo.designpattern.factory.demo3;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:07
 * @desc
 */
public class Customer {
    public static void main(String[] args) {
        CarFactory_A bfa=new BwmFactory_A();
        bfa.produceSedan().run();
        bfa.produceTrunk().run();


        CarFactory_A afa=new AodiFactory_A();
        afa.produceSedan().run();
        afa.produceTrunk().run();

    }
}
