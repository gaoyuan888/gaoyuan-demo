package cn.gaoyuan.demo.netty.rpc;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/12 15:34
 * @desc
 */
public class ResultHandler extends ChannelInboundHandlerAdapter {
    private Object response;


    public Object getResponse() {
        return response;
    }

    @Override
    public void channelRead(ChannelHandlerContext chx, Object msg) {
        response = msg;
        chx.close();
    }
}
