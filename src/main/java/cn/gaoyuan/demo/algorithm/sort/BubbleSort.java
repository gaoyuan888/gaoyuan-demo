package cn.gaoyuan.demo.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

@Test
public void test(){
    int[]a=new int[]{1,2,3,5,6,3,45,6};
    sort(a);
    System.out.println(Arrays.toString(a));
}

    public void sort(int [] a){
        for (int i=0;i<a.length ; i++) {
            for(int j=i;j<a.length;j++){
                if(a[i]<a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
}
