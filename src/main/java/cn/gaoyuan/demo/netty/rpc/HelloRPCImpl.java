package cn.gaoyuan.demo.netty.rpc;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/12 13:01
 * @desc
 */
public class HelloRPCImpl implements HelloRPC {
    @Override
    public String hello(String name) {
        return "hello," + name;
    }
}
