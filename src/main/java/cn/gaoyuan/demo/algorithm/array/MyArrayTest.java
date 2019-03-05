package cn.gaoyuan.demo.algorithm.array;

import cn.gaoyuan.demo.algorithm.quene.MyQuene;
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
public class MyArrayTest {

    @Test
    public void array() {
        int[] a = new int[]{1, 2, 3};

        int[] b = new int[4];

        a = b;
        a[3] = 4;

        System.out.println(Arrays.toString(a));

    }

}
