package cn.gaoyuan.demo.designpattern.adapter;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 19:56
 * @desc
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer->playVlc");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
