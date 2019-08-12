package cn.gaoyuan.demo.netty.demo.server;

/**
 * 实现类:
 *
 * @author yaoyizhou
 * @date 2019/8/12 19:51
 * @desc
 */
public class HelloNettyImpl implements HelloNetty {
    @Override
    public String hello() {
        return "hello,netty";
    }
}
