package cn.gaoyuan.demo.designpattern.factory.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/15 20:30
 * @desc
 */
public class BwmTrunkFactory implements TrunkFactory {
    @Override
    public Trunk_M produceTrunk() {
        return new BwmTrunk_M();
    }
}
