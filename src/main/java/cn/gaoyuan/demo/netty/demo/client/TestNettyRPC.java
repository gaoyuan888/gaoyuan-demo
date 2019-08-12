package cn.gaoyuan.demo.netty.demo.client;


import cn.gaoyuan.demo.netty.demo.clientStub.NettyRPCProxy;

/**
 * ��������:
 *
 * @author yaoyizhou
 * @date 2019/8/12 19:49
 * @desc
 */
public class TestNettyRPC {
    public static void main(String [] args){

        //��1��Զ�̵���
        HelloNetty helloNetty=(HelloNetty) NettyRPCProxy.create(HelloNetty.class);
        System.out.println(helloNetty.hello());

        //��2��Զ�̵���
        HelloRPC helloRPC =  (HelloRPC) NettyRPCProxy.create(HelloRPC.class);
        System.out.println(helloRPC.hello("RPC"));

    }
}
