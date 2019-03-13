package cn.gaoyuan.demo.algorithm.sort.radix.byquene;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:基数排序-利用队列存储中间数组
 *
 * @author yaoyizhou
 * @date 2019/3/12 13:29
 * @desc
 */
public class RadixSort {

    @Test
    public void test() {
        int[] arr = new int[]{12, 3654, 13335, 3232, 42, 6, 234, 3, 5321, 6, 3};
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
            //用队列接收
            Quene[] quenes = new Quene[10];
            for (int l = 0; l <  quenes.length; l++) {
                quenes[l] =  new Quene();
            }
            //按基数将值放到临时数组中
            for (int j = 0; j < arr.length; j++) {
                //按照基数求余数
                int ys = (arr[j] / n) % 10;
                //赋值临时队列
                quenes[ys].add(arr[j]);
            }
            //将临时数组中的值，拷贝到原数组
            int index = 0;
            for (int k = 0; k < quenes.length; k++) {
                while (!quenes[k].isEmpty()) {
                    arr[index++] = quenes[k].poll();
                }
            }
        }
    }
}
