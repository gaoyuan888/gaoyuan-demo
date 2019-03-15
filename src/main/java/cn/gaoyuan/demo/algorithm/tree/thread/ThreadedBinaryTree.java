package cn.gaoyuan.demo.algorithm.tree.thread;

/**
 * 功能描述:线索化二叉树
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:44
 * @desc
 */
public class ThreadedBinaryTree {

    ThreadedNode root;

    /**
     * 临时存储前驱节点
     */
    ThreadedNode tmpPreNode;

    /**
     * 遍历线索二叉树
     */
    public void threadIterate() {
        //临时存储当前遍历节点
        ThreadedNode node = root;
        if (node != null) {
            //循环找到最开始的节点
            while (node.leftType == 0) {
                node = node.left;
            }
            //打印当前节点的值
            System.out.println(node.value);

            //如果当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
            while (node.rightType == 1) {
                node = node.right;
                System.out.println(node.value);
            }
            // 替换遍历的节点
            node=node.right;
        }
    }

    /**
     * 設置根节点
     *
     * @param root
     */
    public void setRoot(ThreadedNode root) {
        this.root = root;
    }

    /**
     * 获取根节点
     */
    public ThreadedNode getRoot() {
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
    public ThreadedNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    /**
     * 中序线索化二叉树
     */
    public void threadNodes() {
        threadNodes(root);
    }

    /**
     * 中序线索化二叉树
     */
    public void threadNodes(ThreadedNode node) {
        //当前节点如果为null,直接返回
        if (node == null) {
            return;
        }

        //处理左子树
        threadNodes(node.left);

        //处理前驱节点
        if (node.left == null) {
            //让当前节点的左指针指向前驱节点
            node.left = tmpPreNode;
            node.leftType = 1;
        }

        //处理前驱的右指针,如果前驱节点的右指针是null(没有指向右子树)
        if (tmpPreNode != null && tmpPreNode.right == null) {
            //让前驱节点的右指针指向当前节点
            tmpPreNode.right = node;
            //改变前驱节点的右指针类型
            tmpPreNode.rightType = 1;
        }

        //每处理一个节点，当前节点当前节点就是下一个节点的前驱节点
        tmpPreNode = node;

        //处理右子树
        threadNodes(node.right);
    }
}
