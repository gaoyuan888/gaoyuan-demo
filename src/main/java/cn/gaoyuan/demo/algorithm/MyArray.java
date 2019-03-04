package cn.gaoyuan.demo.algorithm;

import java.util.Arrays;

/**
 * 功能描述:
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
}
