package cn.gaoyuan.demo.algorithm.tree.listTree;

/**
 * 功能描述:链式存储二叉树
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:44
 * @desc
 */
public class BinaryTree {

    TreeNode root;

    /**
     * 設置根节点
     *
     * @param root
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 获取根节点
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * 前序遍历
     */
    public void frontShow() {
        root.frontShow();
    }

    /**
     * 中序遍历
     */
    public void middleShow() {
        root.middleShow();
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        root.afterShow();
    }

    /**
     * 前序查找
     */
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }
}
