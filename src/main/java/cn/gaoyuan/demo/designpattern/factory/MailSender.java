package cn.gaoyuan.demo.designpattern.factory;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/8 18:37
 * @desc
 */

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail is sended");
    }
}
