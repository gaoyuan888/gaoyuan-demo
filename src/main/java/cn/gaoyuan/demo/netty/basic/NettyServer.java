package cn.gaoyuan.demo.netty.basic;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class NettyServer {
    public static void main(String[] args) {
        //1.创建一个线程组，接收客户端连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //2.创建第二个线程组，处理网络连接
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //3.


    }
}
