package cn.gaoyuan.demo.designpattern.factory.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/12 10:19
 * @desc
 */
public class TrunkFactory {

    //生产宝马及奥迪卡车
    public static Trunk produceTrunk(String type) {
        if (type.equals("宝马")) {
            return new BomTrunk();
        } else if (type.equals("奥迪")) {
            return new BenTrunk();
        } else {
            throw new RuntimeException("没有您要求的卡车");
        }
    }
}
