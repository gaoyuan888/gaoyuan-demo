package cn.gaoyuan.demo.algorithm.tree.heapSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/14 20:10
 * @desc
 */
public class HeapSortTest {

    @Test
    public void test() {
        int[] arr = new int[]{1, 4, 2, 5, 7, 9, 4, 3,};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void heapSort(int[] arr) {
        //开始位置最后一个非叶子节点，即最后一个节点的父节点
        int start = (arr.length - 1) / 2;
        //将数组调整为一个大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        //先把数组中的第0个和堆中的最后一个交换位置，再把前面的处理为大顶堆
        for (int i = arr.length - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            maxHeap(arr, i, 0);
        }
    }


    public void maxHeap(int[] arr, int size, int index) {
        //左子节点
        int leftNode = 2 * index + 1;
        //右子节点
        int rightNode = 2 * index + 2;
        //临时赋值最大点位置
        int max = index;
        //和两个子节点分别对比，找出最大节点
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        if (max != index) {
            int tmp = arr[index];
            arr[index] = arr[max];
            arr[max] = tmp;
            //交换位置后可能会破坏之前的大顶堆，所以，之前拍好的堆需要重新排序
            maxHeap(arr, size, max);
        }

    }

}
