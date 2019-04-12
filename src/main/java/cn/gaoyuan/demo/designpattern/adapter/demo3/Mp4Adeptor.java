package cn.gaoyuan.demo.designpattern.adapter.demo3;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/12 9:47
 * @desc
 */
public class Mp4Adeptor implements MusicPlayer {

    private Mp4MPlayer mp4MPlayer = new Mp4MPlayer();

    @Override
    public void play() {
        mp4MPlayer.playmp4();
    }
}
