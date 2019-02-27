package cn.gaoyuan.demo.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/2/27 9:37
 * @desc
 */
public class NioDemo {

    @Test
    public void client() throws Exception {
        //1、获取通道
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));
        //2、切换非阻塞
        sChannel.configureBlocking(false);
        //3、分配指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        //4、发送数据给服务器
        buf.put(new Date().toString().getBytes());
        buf.flip();
        sChannel.write(buf);
        buf.clear();

        //5、关闭通道
        sChannel.close();
    }

    @Test
    public void server() throws IOException {
        //1获取通道
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        //2、切换非阻塞
        ssChannel.configureBlocking(false);
        //3/绑定连接
        ssChannel.bind(new InetSocketAddress(9898));
        //4 获取选择器
        Selector selector = Selector.open();
        //5、将通道注册到选择器,z指定“监听接收事件”；
        ssChannel.register(selector, SelectionKey.OP_ACCEPT);
        //6. 轮询式的获取选择器上已经准备好的事件
        while (selector.select() > 0) {
            //7、获取当前选择器中所有注册的“选择键（已就绪的监听事件”
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                //8获取准备“就绪”的事件
                SelectionKey sk = iterator.next();
                //9准备好了接收
                if (sk.isAcceptable()) {
                    //10获取客户端连接
                    SocketChannel socketChannel = ssChannel.accept();
                    //11 切换非阻塞
                    socketChannel.configureBlocking(false);
                    //12注册选择器
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (sk.isReadable()) {
                    //13获得读就绪通道
                    SocketChannel socketChannel = (SocketChannel) sk.channel();
                    //14 读取数据
                    ByteBuffer buf = ByteBuffer.allocate(1024);
                    int len = 0;
                    while ((len = socketChannel.read(buf)) > 0) {
                        buf.flip();
                        System.out.println(new String(buf.array(), 0, len));
                        buf.clear();
                    }
                }
                iterator.remove();
            }
        }
    }

}
