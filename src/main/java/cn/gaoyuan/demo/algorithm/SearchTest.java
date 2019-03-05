package cn.gaoyuan.demo.algorithm;

import org.junit.Test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 16:16
 * @desc
 */
public class SearchTest {

    //    二分查找
    @Test
    public void binarySearch() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
        //目标
        int target = 1;
        //开始位置
        int begin = 0;
        //开始位置
        int end = arr.length - 1;
        //中间位置
        int mid = (begin + end) / 2;
        while (true) {
            if (end < begin) {
                throw new RuntimeException("不存在");
            }
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                break;
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }

    }

}
