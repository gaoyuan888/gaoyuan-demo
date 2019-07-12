package cn.gaoyuan.demo.thread.volatiledemo;

/**
 * 通过javap 命令 查看汇编指令n++是实际分为3个步骤的，非原子性操作，因此可能存在并发问题
 * public void add();
 *     Code:
 *        0: aload_0
 *        1: dup
 *        2: getfield      #2                  // Field n:I
 *        5: iconst_1
 *        6: iadd
 *        7: putfield      #2                  // Field n:I
 *       10: return
 *
 */
public class T1 {

    volatile int n = 0;

    public static void main(String[] args) {

    }

    public void add() {
        n++;
    }
}
