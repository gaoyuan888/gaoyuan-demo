package cn.gaoyuan.demo.netty.rpc;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/12 13:00
 * @desc
 */
public class HelloNettyImpl implements HelloNetty {
    @Override
    public String hello() {
        return "hello,netty";
    }
}
