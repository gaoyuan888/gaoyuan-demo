package cn.gaoyuan.demo.algorithm.tree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:40
 * @desc
 */
public class TreeNode {
    /**
     * 权
     */
    int value;
    /**
     * 左儿子
     */
    TreeNode left;
    /**
     * 右儿子
     */
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
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
     * 前序查找
     *
     * @param i
     * @return
     */
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        if (i == value) {
            return this;
        } else {
            if (left != null) {
                target = left.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            if (right != null) {
                target = right.frontSearch(i);
            }
        }
        return target;
    }
}
