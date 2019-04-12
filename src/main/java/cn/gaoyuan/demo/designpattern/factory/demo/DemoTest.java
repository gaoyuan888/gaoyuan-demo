package cn.gaoyuan.demo.designpattern.factory.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/8 18:42
 * @desc
 */
public class DemoTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
