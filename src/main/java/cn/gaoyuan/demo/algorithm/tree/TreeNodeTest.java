package cn.gaoyuan.demo.algorithm.tree;

import org.junit.Test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:43
 * @desc
 */
public class TreeNodeTest {

    @Test
    public void test() {
        BinaryTree binaryTree = new BinaryTree();
        //根节点
        TreeNode node = new TreeNode(1);
        //左节点
        TreeNode left = new TreeNode(2);
        //右节点
        TreeNode right = new TreeNode(3);
        node.setLeft(left);
        node.setRight(right);
        //设置根节点
        binaryTree.setRoot(node);
    }
}
