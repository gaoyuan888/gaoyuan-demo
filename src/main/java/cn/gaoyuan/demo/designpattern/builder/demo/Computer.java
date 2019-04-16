package cn.gaoyuan.demo.designpattern.builder.demo;

/**
 * 功能描述: 电脑产品 具体产品
 *
 * @author yaoyizhou
 * @date 2019/4/16 20:32
 * @desc
 */
public class Computer {
    private String mainBoard;
    private String hardDisk;
    private String cpu;

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
