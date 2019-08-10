package cn.gaoyuan.demo.nio;

import java.nio.channels.SocketChannel;

public class NIOClient {
    public static void main(String[] args) throws Exception {
        //1.得到一个网络通道
        SocketChannel open = SocketChannel.open();
    }
}
