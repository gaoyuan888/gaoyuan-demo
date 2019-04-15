package cn.gaoyuan.demo.designpattern.factory.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/12 10:13
 * @desc
 */
public class BenTrunk implements Trunk {
    @Override
    public void run() {
        System.out.println("BenTrunk->run");
    }
}
