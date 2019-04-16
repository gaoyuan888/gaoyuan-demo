package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:59
 * @desc
 */
public class BuildComputer1 implements Builder {
    private Computer c = new Computer();

    @Override
    public void buildMainBoard() {
        c.setMainBoard("技嘉");
    }

    @Override
    public void buildHardDisk() {
        c.setHardDisk("三星 500G");
    }

    @Override
    public void buildCpu() {
        c.setCpu("AMD 4核");
    }

    @Override
    public Computer buildComputer() {
        return c;
    }
}
