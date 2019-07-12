package cn.gaoyuan.demo.thread.volatiledemo;

/**
 * 通过javap 命令 查看汇编指令n++是实际分为3个步骤的，非原子性操作，因此可能存在并发问题
 */
public class T1 {

    volatile int n = 0;

    public static void main(String[] args) {

    }

    public void add() {
        n++;
    }
}
