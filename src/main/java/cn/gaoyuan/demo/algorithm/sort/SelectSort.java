package cn.gaoyuan.demo.algorithm.sort;

/**
 * 选择排序
 */
public class SelectSort {

    public void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            //把当前遍历的数和后面所有的数一次比较，并记录下最小的数的下标
            for(int j=i+1;j<arr.length;j++){
                //如果后面比较的数，比记录的最小的数小
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            //如果最小的数和当前遍历的数的小标不一致
            if(i!=minIndex){
                int tmp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tmp;
            }
        }
    }

}
