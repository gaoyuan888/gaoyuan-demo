package cn.gaoyuan.demo.designpattern.factory.demo3;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/16 19:50
 * @desc
 */
public interface CarFactory_A {

    //生产卡车
    Trunk_A produceTrunk();

    //生产轿车
    Sedan_A produceSedan();
}
