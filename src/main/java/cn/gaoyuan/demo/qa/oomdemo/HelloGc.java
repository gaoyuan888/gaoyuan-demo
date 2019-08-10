package cn.gaoyuan.demo.qa.oomdemo;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class HelloGc {

    public static void main(String[] args) {

//        gcOverhead();

        directBufferMemory();
    }

    private static void directBufferMemory() {
        //        -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        System.out.println("配置的maxDirectMemory:" + (sun.misc.VM.maxDirectMemory() / 1024 / 1024) + "MB");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ByteBuffer.allocateDirect(6 * 1024 * 1024);

    }

    private static void gcOverhead() {
//        -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        int i = 0;
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add(String.valueOf(++i).intern());
            }

        } catch (Exception e) {
            System.out.println(i);
        }

    }
}
