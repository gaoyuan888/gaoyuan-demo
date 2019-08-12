package cn.gaoyuan.demo.netty.basic;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class NettyClient {
    public static void main(String[] args) throws Exception {
        //1.创建一个线程组
        NioEventLoopGroup group = new NioEventLoopGroup();
        //2.创建客户端的启动助手，完成相关配置
        Bootstrap b = new Bootstrap();
        //3.设置线程组
        b.group(group)
                //4.设置客户端通道实现类
                .channel(NioSocketChannel.class)
                //5.创建一个初始化对象
                .handler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        //6.向pipeline中添加自定义的handler
                        socketChannel.pipeline().addLast(new NettyClientHandler());
                    }
                });
        System.out.println("客户端 is ready");
        //7.启动客户端连接服务器
        ChannelFuture future = b.connect("127.0.0.1", 9999).sync();
        //8.关闭连接,异步非阻塞
//        future.channel().closeFuture().sync();
    }

}
