package cn.gaoyuan.demo.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOServer {

    public static void main(String[] args) throws Exception {
        //1.得到一个serverSocketChannel对象，老大
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        //2.得到一个Select对象，间谍
        Selector selector = Selector.open();

        //3.绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(9999));

        //4.设置非阻塞方式
        serverSocketChannel.configureBlocking(false);

        //5.把ServerSocketChannel对象注册给Selector对象
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        //6.干活
        while (true) {
            //6.1 监控客户端
            if (selector.select(2000) == 0) {
                System.out.println("服务端：现在还没有客户端连接我，我就干点别的事情");
                continue;
            }
            //6.2 得到SelectionKey 判断通道里的请求事件
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                //请求连接事件
                if (key.isAcceptable()) {
                    System.out.println("OP_ACCEPT");
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    //注意此处一定要申请通道，然后将通道注册到间谍(selector),接收read事件
                    socketChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }

                if (key.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = (ByteBuffer) key.attachment();
                    socketChannel.read(byteBuffer);
                    System.out.println("客户端发来数据：" + new String(byteBuffer.array()));
                }
                //手动从集合中移除当前key,防止重复处理
                iterator.remove();
            }

        }
    }
}
