package cn.gaoyuan.demo.algorithm.tree.huffman.demo1;

import java.util.*;

public class TestHuffmanCode {

    public static void main(String[] args) {
        String msg = "can you can a can as a can canner can a can";
        byte[] bytes = msg.getBytes();
        //进行霍夫曼编码
        byte[] b = huffmanCode(bytes);

    }

    /**
     * 进行霍夫曼编码压缩的方法
     *
     * @param bytes
     * @return
     */
    private static byte[] huffmanCode(byte[] bytes) {
        //先统计每一个byte出现的次数，并放入一个集合中
        List<Node> nodes = getNodes(bytes);
        //创建一棵霍夫曼树
        Node tree = createHuffmanTree(nodes);
        //创建一颗霍夫曼编码表出来

        //编码
        return null;
    }

    /**
     * 创建霍夫曼树
     *
     * @param nodes
     * @return
     */
    private static Node createHuffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            //排序
            Collections.sort(nodes);
            // 取出两个全职最低的二叉树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //创建一棵新的二叉树
            Node parent = new Node(null, left.weight + right.weight);
            //把之前取出来的两棵二叉树设置为新创建的二叉树的子树
            parent.left = left;
            parent.right = right;
            //把前面取出来的两颗二叉树删除
            nodes.remove(left);
            nodes.remove(right);
            //把新创建的二叉树放入集合中
            nodes.add(parent);

        }
        return nodes.get(0);
    }

    /**
     * 把byte 数组转为node集合
     *
     * @param bytes
     * @return
     */
    private static List<Node> getNodes(byte[] bytes) {
        List<Node> list = new ArrayList<>();
        Map<Byte, Integer> counts = new HashMap<>();
        //统计每一个byte出现的次数
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if (count == null) {
                counts.put(b, 1);
            } else {
                counts.put(b, count + 1);
            }
        }
        //把每一个键值对转为一个node对象
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            list.add(new Node(entry.getKey(), entry.getValue()));
        }
        System.out.println(counts);
        return list;
    }
}
