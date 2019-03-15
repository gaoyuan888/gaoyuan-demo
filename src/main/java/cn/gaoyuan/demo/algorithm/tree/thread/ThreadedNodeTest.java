package cn.gaoyuan.demo.algorithm.tree.thread;

import org.junit.Test;

/**
 * 功能描述:线索化二叉树
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:43
 * @desc
 */
public class ThreadedNodeTest {

    @Test
    public void test() {
        ThreadedBinaryTree binaryTree = new ThreadedBinaryTree();
        //根节点
        ThreadedNode root = new ThreadedNode(1);
        //为根节点创建左、右节点
        ThreadedNode left = new ThreadedNode(2);
        ThreadedNode right = new ThreadedNode(3);
        root.setLeft(left);
        root.setRight(right);
        //设置根节点
        binaryTree.setRoot(root);

        //第二层左节点创建两个子节点
        left.setLeft(new ThreadedNode(4));
        ThreadedNode fiveNode=new ThreadedNode(5);
        left.setRight(fiveNode);
        //第二层右节点创建两个子节点
        right.setLeft(new ThreadedNode(6));
        right.setRight(new ThreadedNode(7));

        //中序遍历
        binaryTree.middleShow();
        System.out.println("*************");
        //中序线索化二叉树
        binaryTree.threadNodes();

//      中序遍历线索化二叉树
        binaryTree.threadIterate();
    }
}
