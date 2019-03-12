package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:基数排序
 *
 * @author yaoyizhou
 * @date 2019/3/12 13:29
 * @desc
 */
public class RadixSort {

    @Test
    public void test() {
        int[] arr = new int[]{1, 3654, 15, 3232, 4, 6, 234, 3, 5321, 6, 3};
        System.out.println(Arrays.toString(arr));
        redixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void redixSort(int[] arr) {
        //确定最大位数
        Integer max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        //最大值的位数就是需要循环的次數
        int maxLengh = (max + "").length();
        for (int i = 0, n = 1; i < maxLengh; i++, n *= 10) {
            //用于记录在响应的数组中存放的数字的数量
            int[] count = new int[10];
            //临时数组
            int[][] tmpArr = new int[10][arr.length];
            //按基数将值放到临时数组中
            for (int j = 0; j < arr.length; j++) {
                //按照基数求余数
                int ys = (arr[j] / n) % 10;
                //赋值临时数组
                tmpArr[ys][count[ys]++] = arr[j];
            }
            //将临时数组中的值，拷贝到原数组
            int index = 0;
            for (int k = 0; k < 10; k++) {
                for (int m = 0; m < count[k]; m++) {
                    arr[index++] = tmpArr[k][m];
                }
            }
        }
    }
}
