package cn.gaoyuan.demo.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
        //获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 6399));
        //获取文件通道
        FileChannel fileChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);
        //获取缓冲区
        ByteBuffer bf = ByteBuffer.allocate(1024);
        //读取文件
        while (fileChannel.read(bf) != -1) {
            bf.flip();
            socketChannel.write(bf);
            bf.clear();
        }
    }

    @Test
    public void server() throws Exception {
        //获取管道
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        //绑定端口
        ssChannel.bind(new InetSocketAddress(6399));
        //数据通道
        FileChannel fileChannel = FileChannel.open(Paths.get("2.jpg"));
        //获取缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //获取通道
        SocketChannel accept = ssChannel.accept();

        while (accept.read(byteBuffer) != -1) {
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }

    }


}
