package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:
 * 具体的构建者
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:45
 * @desc
 */
public class BuildComputer implements Builder {
    private Computer c = new Computer();

    @Override
    public void buildMainBoard() {
        c.setMainBoard("华硕");
    }

    @Override
    public void buildHardDisk() {
        c.setHardDisk("希捷500G");
    }

    @Override
    public void buildCpu() {
        c.setCpu("intel i5");
    }

    @Override
    public Computer buildComputer() {
        return c;
    }
}
