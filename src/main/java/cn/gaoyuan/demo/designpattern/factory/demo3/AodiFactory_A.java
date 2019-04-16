package cn.gaoyuan.demo.designpattern.factory.demo3;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/16 19:55
 * @desc
 */
public class AodiFactory_A implements CarFactory_A {
    @Override
    public Trunk_A produceTrunk() {
        return new AodiTrunk_A();
    }

    @Override
    public Sedan_A produceSedan() {
        return new AodiSedan_A();
    }
}
