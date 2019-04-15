package cn.gaoyuan.demo.designpattern.factory.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/12 10:10
 * @desc
 */
public class BomTrunk implements Trunk {
    @Override
    public void run() {
        System.out.println("BomTrunk->run");
    }
}
