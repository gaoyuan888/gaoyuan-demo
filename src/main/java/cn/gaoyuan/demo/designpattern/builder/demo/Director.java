package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述: 建造者
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:48
 * @desc
 */
public class Director {

    public static Computer constructorCom(BuildComputer bc){
        bc.buildCpu();
        bc.buildHardDisk();
        bc.buildMainBoard();
        return bc.buildComputer();

    }
}
