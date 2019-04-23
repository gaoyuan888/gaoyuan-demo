package cn.gaoyuan.demo.algorithm.tree.sorttree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:37
 * @desc
 */
public class TestBinarySortTree {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 10, 12};
        BinarySortTree bst = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            bst.add(new Node(i));
        }
        //中序遍历二叉树
        bst.frontShow();
    }
}
