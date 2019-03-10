package cn.gaoyuan.demo.algorithm.recursive;

import org.junit.Test;

/**
 * 功能描述:递归
 *
 * @author yaoyizhou
 * @date 2019/3/7 21:37
 * @desc
 */
public class Recursive {

    @Test
    public void test() {
//        print(10);

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        binarySearch(0, a.length, 3, a);
    }



    /**
     * 简单示例
     * @param i
     */
    public static void print(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        print(i - 1);
    }

    //二分查找-递归
    public void binarySearch(int start, int end, int flag, int[] array) {
        int middle = (start + end) / 2;
        if (array[middle] == flag || start > end) {
            System.out.println(array[middle]);
            return;
        } else {
            if (array[middle] > flag) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            binarySearch(start, end, flag, array);
        }
    }
}
