package cn.gaoyuan.demo.algorithm.tree.array;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/14 12:57
 * @desc
 */
public class ArrayBinaryTree {

    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    /**
     * 前序遍历二叉树，中序遍历和后序遍历一样
     *
     * @param index
     */
    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点的内容
        System.out.println(data[index]);
        //遍历左节点2*index+1
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }

}
