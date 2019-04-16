package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:53
 * @desc
 */
public class TestBuilder {
    public static void main(String[] args) {
        Computer computer = Director.constructorCom(new BuildComputer());

        System.out.println(computer);

    }
}
