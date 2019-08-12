package cn.gaoyuan.demo.netty.basic;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyServer {
    public static void main(String[] args) throws Exception {
        //1.创建一个线程组，接收客户端连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //2.创建第二个线程组，处理网络连接IO操作
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //3.创建服务器端启动助手来配置参数
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                //4.设置两个线程组
                .group(bossGroup, workerGroup)
                //5.使用NioServerSocketChannel作为服务器端通道的实现
                .channel(NioServerSocketChannel.class)
                //6.设置线程队列中等待连接的个数
                .option(ChannelOption.SO_BACKLOG, 128)
                //7.保持活动连接状态
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                //8.配置通道初始化对象
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        //9.将自定义的handler加到执行链（pipeline），后续会自动执行
                        socketChannel.pipeline().addLast(new NettyServerHandler());
                    }
                });
        System.out.println("服务器端准备完毕！");
        //10.绑定（非阻塞）
        ChannelFuture future = serverBootstrap.bind(9999).sync();
        System.out.println("服务器启动成功");
        //11.异步关闭铜带，关闭线程组
        future.channel().close().sync();
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();

    }
}
