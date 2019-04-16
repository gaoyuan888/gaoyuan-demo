package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述:抽象构建
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:41
 * @desc
 */
public interface Builder {

    // 构建主板
    public void buildMainBoard();

    //构建硬盘
    public void buildHardDisk();

    //构建cpu
    public void buildCpu();

    //组件电脑
    public Computer buildComputer();
}
