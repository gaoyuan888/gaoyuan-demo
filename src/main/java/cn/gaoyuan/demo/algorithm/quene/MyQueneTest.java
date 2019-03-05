package cn.gaoyuan.demo.algorithm.quene;

import cn.gaoyuan.demo.algorithm.stack.MyStack;
import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class MyQueneTest {

    @Test
    public void myQuene() {
        MyQuene quene = new MyQuene();
        quene.add(3);
        quene.add(4);
        quene.add(5);

        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());

        System.out.println(quene.isEmpty());

    }


}
