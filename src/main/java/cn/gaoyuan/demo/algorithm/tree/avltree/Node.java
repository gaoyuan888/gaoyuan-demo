package cn.gaoyuan.demo.algorithm.tree.avltree;

import java.util.Map;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:30
 * @desc
 */
public class Node {
    int value;
    Node right;
    Node left;

    /**
     * 返回当前节点高度
     *
     * @return
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }

    public Node(int value) {
        this.value = value;
    }

    /**
     * 向子树中添加节点
     *
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        //添加的节点比当前的节点更小
        if (node.value < this.value) {

            //如果左节点为空
            if (this.left == null) {
                this.left = node;
                //如果左节点比为空
            } else {
                this.left.add(node);
            }

        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
        //查询是否平衡
        //进行右旋转
        if (left.height() - right.height() >= 2) {

        //左旋转
        }else{

        }
    }

    /**
     * 中序遍历二叉树排序树，正好是从小到大的顺序
     *
     * @param node
     */
    public void middleShow(Node node) {
        if (node == null) {
            return;
        }
        middleShow(node.left);
        System.out.println(node.value);
        middleShow(node.right);

    }

    /**
     * 节点查找
     *
     * @param value
     * @return
     */
    public Node search(int value) {
        if (this.value == value) {
            return this;
        } else if (this.value > value) {

            return left == null ? null : left.search(value);
        } else {
            return right == null ? null : right.search(value);
        }
    }

    /**
     * 搜索当前节点的父节点
     *
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
            return this;
        } else {
            if (this.value > value && this.left != null) {
                return this.left.searchParent(value);
            } else if (this.value < value && this.right != null) {
                return this.right.searchParent(value);
            }
            return null;
        }


    }
}
