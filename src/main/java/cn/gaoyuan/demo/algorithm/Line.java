package cn.gaoyuan.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class Line {

    @Test
    public void array() {
        int[] a = new int[]{1, 2, 3};

        int[] b = new int[4];

        a = b;
        a[3] = 4;

        System.out.println(Arrays.toString(a));

    }

    @Test
    public void addValue() {

        int[] a = new int[]{1, 2, 3, 4};

        int[] b = new int[a.length - 1];

        int flag = 2;

        for (int i = 0; i < a.length - 1; i++) {
            if (i < flag) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
