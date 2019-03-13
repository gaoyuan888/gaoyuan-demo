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
        TreeNode root = new TreeNode(1);
        //为根节点创建左、右节点
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        //设置根节点
        binaryTree.setRoot(root);

        //第二层左节点创建两个子节点
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        //第二层右节点创建两个子节点
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));

        //前序遍历
        binaryTree.frontShow();
        System.out.println("*************");
        //中序遍历
        binaryTree.middleShow();
        System.out.println("*************");
        //后续序遍历
        binaryTree.afterShow();

        System.out.println("*******前序查找******");

        //前序查找
        TreeNode node = binaryTree.frontSearch(4);
        System.out.println(node.toString());

    }
}
