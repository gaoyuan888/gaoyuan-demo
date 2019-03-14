package cn.gaoyuan.demo.algorithm.tree.thread;

/**
 * 功能描述:链式存储二叉树
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:40
 * @desc
 */
public class ThreadedNode {
    /**
     * 权
     */
    int value;
    /**
     * 左儿子
     */
    ThreadedNode left;
    /**
     * 右儿子
     */
    ThreadedNode right;

    /**
     * 标识指针类型
     */
    int leftType;
    int rightType;

    public ThreadedNode(int value) {
        this.value = value;
    }

    public ThreadedNode getLeft() {
        return left;
    }

    public void setLeft(ThreadedNode left) {
        this.left = left;
    }

    public ThreadedNode getRight() {
        return right;
    }

    public void setRight(ThreadedNode right) {
        this.right = right;
    }

    /**
     * 前序遍历
     */
    public void frontShow() {
        //先遍历当前节点内容
        System.out.println(value);
        //遍历左节点
        if (left != null) {
            left.frontShow();
        }
        //遍历右节点
        if (right != null) {
            right.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void middleShow() {
        //先遍历左节点
        if (left != null) {
            left.middleShow();
        }
        //打印当前节点
        System.out.println(value);
        //先遍历右节点
        if (right != null) {
            right.middleShow();
        }
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        if (left != null) {
            left.afterShow();
        }
        if (right != null) {
            right.afterShow();
        }
        System.out.println(value);
    }

    /**
     * 前序查找(中序遍历和后续遍历一样)
     *
     * @param i
     * @return
     */
    public ThreadedNode frontSearch(int i) {
        ThreadedNode target = null;
        //对比当前节点的值
        if (i == value) {
            return this;
        } else {
            //对比当左儿子的值
            if (left != null) {
                target = left.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            //对比当右儿子的值
            if (right != null) {
                target = right.frontSearch(i);
            }
        }
        return target;
    }
}
