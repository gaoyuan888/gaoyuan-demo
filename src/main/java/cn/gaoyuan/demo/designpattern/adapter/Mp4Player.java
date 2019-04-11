package cn.gaoyuan.demo.designpattern.adapter;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 19:58
 * @desc
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player->playMp4");
    }
}
