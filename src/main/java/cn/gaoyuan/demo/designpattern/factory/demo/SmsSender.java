package cn.gaoyuan.demo.designpattern.factory.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/8 18:38
 * @desc
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms is sended");
    }
}
