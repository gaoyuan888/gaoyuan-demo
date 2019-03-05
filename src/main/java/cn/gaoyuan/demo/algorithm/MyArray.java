package cn.gaoyuan.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述: 数组
 *
 * @author yaoyizhou
 * @date 2019/3/4 12:57
 * @desc
 */
public class MyArray {

    private int[] elements;

    public MyArray(int array[]) {
        this.elements = array;
    }

    public int getSize() {
        return this.elements.length;
    }

    public void addEle(int value) {
        int[] b = new int[this.elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            b[i] = this.elements[i];
        }
        b[this.elements.length] = value;
    }

    public void showEle() {
        System.out.println(Arrays.toString(this.elements));
    }

    public void delEle(int index) {
        int[] newArr = new int[this.elements.length - 1];
        for (int i = 0; i < this.elements.length - 1; i++) {
            if (i < index) {
                newArr[i] = this.elements[i];
            } else {
                newArr[i] = this.elements[i + 1];
            }
        }
        this.elements = newArr;
    }

    public void insert(int index, int ele) {
        int[] newArry = new int[this.elements.length + 1];
        for (int i = 0; i < this.elements.length - 1; i++) {
            if (i < index) {
                newArry[i] = this.elements[i];
            } else if (i > index) {
                newArry[i] = this.elements[i + 1];
            } else {
                newArry[i] = ele;
            }
        }
        this.elements = newArry;

    }

    //二分查找
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
