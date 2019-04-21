package cn.gaoyuan.demo.algorithm.tree.huffman;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/15 21:36
 * @desc
 */
public class Node implements Comparable<Node> {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node node) {
        return this.value-node.value;
    }
}
