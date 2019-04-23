package cn.gaoyuan.demo.algorithm.tree.sorttree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:30
 * @desc
 */
public class BinarySortTree {
    Node root;

    /**
     * 想二叉排序树中添加节点
     *
     * @param node
     */
    public void add(Node node) {
        if(root==null){
            root=node;
        }else {
            root.add(node);
        }

    }

    public void frontShow(){
        if(root!=null){
            root.frontShow(root);
        }
    }
}
