package cn.gaoyuan.demo.algorithm.tree.huffman.demo1;

public class Node implements Comparable<Node>{

    Byte data;
    int weight;
    Node left;
    Node right;

    public Node(Byte b,int weight){
        this.data=b;
        this.weight=weight;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight-this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}
