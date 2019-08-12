package cn.gaoyuan.demo.netty.rpc;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

/**
 * 功能描述:
 * 用 Netty 实现的网络服务器，采用 Netty 自带的 ObjectEncoder 和 ObjectDecoder
 * 作为编解码器（为了降低复杂度，这里并没有使用第三方的编解码器），当然实际开发时也
 * 可以采用 JSON 或 XML
 *
 * @author yaoyizhou
 * @date 2019/8/12 13:37
 * @desc
 */
public class NettyRPCServer {
    private int port;

    public NettyRPCServer(int port) {
        this.port = port;
    }

    private void start() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap
                    .group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .localAddress(port)
                    .childHandler(
                            new ChannelInitializer<SocketChannel>() {
                                @Override
                                protected void initChannel(SocketChannel socketChannel) throws Exception {
                                    ChannelPipeline pipeline = socketChannel.pipeline();
                                    //编码器
                                    pipeline.addLast("encoder", new ObjectEncoder());
                                    //解码器
                                    pipeline.addLast("decoder", new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));
                                    //服务器端业务处理类
                                    pipeline.addLast(new InvokeHandler());

                                }
                            }
                    );
            ChannelFuture future = serverBootstrap.bind(port).sync();
            System.out.println("====server is ready====");
            future.channel().closeFuture().sync();


        } catch (Exception e) {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        } finally {

        }
    }

    public static void main(String[] args) {
        new NettyRPCServer(9999).start();
    }

}
