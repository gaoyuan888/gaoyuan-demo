package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    @Test
    public void test(){
        int[]arr=new int[]{1,3,5,2,4,6,4,3,5,6,3};
        quick(1,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    public void quick(int start,int end,int [] arr){
        if(start<end){
            //取第0位置的数作为标准
            int flag=arr[start];
            int low=start;
            int height=end;
            //循环找到比标准数大的数和比标准小的数
            while (low<height){
                //右边的数比左边的数大
                while (low<height && flag<=arr[height]){
                    height--;
                }
                //修改标记值
                arr[low]=arr[height];
                //左边的数比右边的数小
                while (low<height&&flag>=arr[low]){
                    low++;
                }
                arr[height]=arr[low];
            }
            arr[low]=flag;
            //递归前一部分
            quick(start,low,arr);
            //递归后一部分
            quick(low+1,end,arr);
        }



    }
}
