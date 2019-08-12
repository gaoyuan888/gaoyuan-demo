package cn.gaoyuan.demo.netty.demo.client;


import cn.gaoyuan.demo.netty.demo.clientStub.NettyRPCProxy;

/**
 * 主测试类:
 *
 * @author yaoyizhou
 * @date 2019/8/12 19:49
 * @desc
 */
public class TestNettyRPC {
    public static void main(String [] args){

        //1.第一次远程调用
        HelloNetty helloNetty=(HelloNetty) NettyRPCProxy.create(HelloNetty.class);
        System.out.println(helloNetty.hello());

        //1.第二次远程调用
        HelloRPC helloRPC =  (HelloRPC) NettyRPCProxy.create(HelloRPC.class);
        System.out.println(helloRPC.hello("RPC"));

    }
}
