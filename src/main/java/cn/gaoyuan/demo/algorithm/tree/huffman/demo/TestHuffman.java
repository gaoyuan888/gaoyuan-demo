package cn.gaoyuan.demo.algorithm.tree.huffman.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/15 21:36
 * @desc
 */
public class TestHuffman {

    @Test
    public void test() {
        int[] arr = {3, 5, 7, 8, 11, 23, 14, 29};

        Node huffmanTree = createHuffmanTree(arr);
        System.out.println(huffmanTree);
    }

    /**
     * 创建霍夫曼树
     *
     * @param arr
     * @return
     */
    public Node createHuffmanTree(int[] arr) {

        //先使用数组中所有的元素创建若干个二叉树（只有一个节点）
        List<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        //排序处理
        while(nodes.size()>1){
            //排序,Node需要实现comparable 接口
            Collections.sort(nodes);
            //取出两个权值最小的二叉树
            //取出权值最小的二叉树
            Node left=nodes.get(nodes.size()-1);
            //取出权值次小的二叉树
            Node right=nodes.get(nodes.size()-2);
            //创建一个新的二叉树
            Node parent=new Node(left.value+right.value);
            //把取出来的二叉树移除掉
            nodes.remove(left);
            nodes.remove(right);
            //放入原来的二叉树集合中
            nodes.add(parent);
        }
        System.out.println(nodes);
        return nodes.get(0);
     }
}
