package cn.gaoyuan.demo.algorithm.jzoffer;

/**
 * 功能描述: 剑指offer36.二叉搜索树与双向链表
 *
 * @author yaoyizhou
 * @date 2019/9/25 10:27
 * @desc
 */

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }
}



public class Jzoffer36 {

    //   定义pre成员
    static TreeNode pre = null;

    public static TreeNode solution(TreeNode curr) {
        if (curr == null) {
            return null;
        }
        if (curr.left != null) {
            solution(curr.left);
        }
        curr.left = pre;
        if (pre != null) {
            pre.right = curr;
        }
        pre = curr;
        if (curr.right != null) {
            solution(curr.right);
        }
        return curr;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        root.left = l1;
        root.right = r1;

        TreeNode l2 = new TreeNode(1);
        TreeNode r2 = new TreeNode(3);
        l1.left = l2;
        l1.right = r2;


        TreeNode l3 = new TreeNode(5);
        TreeNode r3 = new TreeNode(7);
        r1.left = l3;
        r1.right = r3;


        TreeNode treeNode = solution1(root);

        System.out.println(treeNode);


    }


    public static TreeNode solution1(TreeNode root) {
        TreeNode solution = solution(root);
        while (solution.left != null) {
            solution = solution.left;
        }
        return solution;

    }


}
