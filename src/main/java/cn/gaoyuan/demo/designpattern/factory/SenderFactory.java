package cn.gaoyuan.demo.designpattern.factory;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/8 18:39
 * @desc
 */
public class SenderFactory {

    Sender produce(String type) {
        if (type.equals("sms")) {
            return new SmsSender();
        } else if (type.equals("mail")) {
            return new MailSender();
        } else {
            System.out.println("输入类型错误");
            return null;
        }
    }
}
