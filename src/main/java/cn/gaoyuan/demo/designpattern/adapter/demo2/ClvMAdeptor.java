package cn.gaoyuan.demo.designpattern.adapter.demo2;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/12 9:43
 * @desc
 */
public class ClvMAdeptor extends ClvMPlayer implements MoviePlayer {
    @Override
    public void play() {
        super.playClv();
    }
}
