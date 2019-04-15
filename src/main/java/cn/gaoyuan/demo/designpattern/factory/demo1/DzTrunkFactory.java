package cn.gaoyuan.demo.designpattern.factory.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/15 20:37
 * @desc
 */
public class DzTrunkFactory implements TrunkFactory {
    @Override
    public Trunk_M produceTrunk() {
        return new DzTrunk_M();
    }
}
