package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 希尔排序-不懂原理
 */
public class ShellSort {

    @Test
    public void test(){
        int[] arr=new int[]{1,4,3,2,5,7,8,5,78};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void shellSort(int[] arr){
        //遍历所有步长
        for(int d=arr.length/2;d>0;d/=2){
            //遍历所有的元素
            for(int i=d;i<arr.length;i++){
                //遍历本组中的元素
                for(int j=i-d;j>=0;j-=d){
                    //如果当前元素大于加上步长后的那个元素
                    if (arr[j]>arr[j+d]) {
                        int tmp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=tmp;
                    }
                }
            }
        }

    }
}
