package cn.gaoyuan.demo.nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioLocalFile {

    /**
     * 向文件写数据
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        //1.获取输出流
        FileOutputStream fos = new FileOutputStream("abc.txt");
        //2.获取通道
        FileChannel fc = fos.getChannel();
        //3.获取缓冲区
        ByteBuffer bb = ByteBuffer.allocate(1024);
        //4.向缓冲区存放数据
        //===4.1首先生成一个字符串
        String dataStr = "hello.nio";
        //===4.2向缓冲区存放数据
        bb.put(dataStr.getBytes());
        //5.翻转缓冲区
        bb.flip();
        //6.将缓冲区写到通道中
        fc.write(bb);
        //7.关闭
        fos.close();
    }


    /**
     * 从文件读数据
     */
    @Test
    public void test2() throws Exception {
        //1.创建输入流
        FileInputStream fis = new FileInputStream("abc.txt");
        //2.获取通道
        FileChannel channel = fis.getChannel();
        //3.获取缓区
        ByteBuffer bb = ByteBuffer.allocate(1024);
        //4.从通道读取数据到缓冲区
        channel.read(bb);
        //5.打印一下数据
        System.out.println(new String(bb.array()));
        //6.关闭
        fis.close();

    }
}
