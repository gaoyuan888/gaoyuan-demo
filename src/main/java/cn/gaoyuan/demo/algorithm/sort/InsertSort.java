package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    @Test
    public void test(){
        int[]arr=new int[]{1,2,8,4,5,6,4,3,2};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void insert(int[]arr){
        for(int i=1;i<arr.length;i++){
//            如果下一个数比上一个数小，重新遍历一边前面的数
            if(arr[i-1]>arr[i]){
                int tmp=arr[i];
                int j;
                for(j=i-1;j>=0 && arr[j]>tmp;j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=tmp;
            }
        }
    }
}
