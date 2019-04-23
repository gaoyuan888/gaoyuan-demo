package cn.gaoyuan.demo.algorithm.tree.sorttree;

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
    }

    /**
     * 中序遍历二叉树排序树，正好是从小到大的顺序
     *
     * @param node
     */
    public void frontShow(Node node) {
        if (node == null) {
            return;
        }
        frontShow(node.left);
        System.out.println(node.value);
        frontShow(node.right);

    }
}
