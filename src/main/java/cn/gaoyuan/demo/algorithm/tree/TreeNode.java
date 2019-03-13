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



}
