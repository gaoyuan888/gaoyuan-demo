package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:归并排序
 *
 * @author yaoyizhou
 * @date 2019/3/11 19:55
 * @desc
 */
public class MergeSort {

    @Test
    public void test() {
        int[] arr = new int[]{1, 4, 2, 5, 6, 2, 6, 2, 4};
        System.out.println(Arrays.toString(arr));

        merge(arr, 0, 4, 8);
        System.out.println(Arrays.toString(arr));
    }

    public void merge(int[] arr, int start, int middle, int end) {
        int[] tmp = new int[end - start + 1];
        int index = 0;
        int low = start;
        int height = middle;
        while (low <= middle && height <= end) {
            if (arr[low] <= arr[height]) {
                tmp[index++] = arr[low++];
            } else {
                tmp[index++] = arr[height++];
            }
        }
        while (low <= middle) {
            tmp[index++] = arr[low++];
        }
        while (height <= end) {
            tmp[index++] = arr[height++];
        }
        for (int i = 0; i < tmp.length; i++) {
            arr[start + i] = tmp[i];
        }
    }

}
