package cn.gaoyuan.demo.algorithm.tree.huffman.demo1;

import java.io.*;
import java.util.*;

/**
 *
 */
public class TestHuffmanCode {

    public static void main(String[] args) {
//        String msg = "can you can a can as a can canner can a can";
//        byte[] bytes = msg.getBytes();
//        //进行霍夫曼编码
//        byte[] b = huffmanZip(bytes);
//        //使用霍夫曼编码进行解码
//        byte[] newByte = decode(b, huffCodes);
//        System.out.println(new String(newByte));

        String src = "1.bmp";
        String dst = "2.zip";
        try {
            zipFile(src, dst);

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            unZip("2.zip", "3.bmp");
        } catch (Exception e) {

        }
    }

    /**
     * 解压缩方法
     *
     * @param src
     * @param dst
     * @throws Exception
     */
    private static void unZip(String src, String dst) throws Exception {
        //先读物文件数据
        //创建一个输入流
        InputStream is = new FileInputStream("2.zip");
        ObjectInputStream ois = new ObjectInputStream(is);
        //读物byte数组
        byte[] b = (byte[]) ois.readObject();

        //读取霍夫曼编码表
        Map<Byte, String> codes = (Map<Byte, String>) ois.readObject();

        ois.close();

        is.close();

        //解码
        byte[] bytes = decode(b, codes);

        //创建一个输出流
        OutputStream os = new FileOutputStream(dst);
        os.write(bytes);
        os.close();


    }


    public static void zipFile(String src, String dst) {
        try {
            //创建一个输入流
            InputStream is = new FileInputStream(src);
            //创建一个和输入流指向文件大小一样的byte数组
            byte[] b = new byte[is.available()];
            //读取文件内容
            is.read(b);
            is.close();
            //使用霍夫曼编码进行编码
            byte[] byteZip = huffmanZip(b);
            //输出流
            OutputStream os = new FileOutputStream(dst);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            //吧压缩后的byte数组写入文件
            oos.writeObject(byteZip);
            //把霍夫曼编码表写入文件
            oos.writeObject(huffCodes);
            oos.close();
            os.close();

//            System.out.println(b.length);
//            System.out.println(byteZip.length);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用指定的霍夫曼编码表进行解码
     *
     * @param bytes
     * @param huffCodes
     * @return
     */
    private static byte[] decode(byte[] bytes, Map<Byte, String> huffCodes) {
        StringBuilder sb = new StringBuilder();
        //把byte数组转为一个二进制的字符串
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            //是否是最后一个
            boolean flag = (i == bytes.length - 1);
            sb.append(byteToBitStr(!flag, b));
        }


        //把字符串按照指定的霍夫曼编码进行解码
        //把霍夫曼编码的键值对进行调换
        Map<String, Byte> map = new HashMap<>();
        for (Map.Entry<Byte, String> entry : huffCodes.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        //创建一个集合用于存储byte数组
        List<Byte> list = new ArrayList<>();

        //处理字符串
        for (int i = 0; i < sb.length(); ) {
            int count = 1;
            boolean flag = true;
            Byte b = null;
            //截取出一个key
            while (flag) {
                String s = sb.substring(i, i + count);
                b = map.get(s);
                if (b == null) {
                    count++;
                } else {
                    flag = false;
                }
            }
            list.add(b);
            i += count;
        }
//        System.out.println(list);
        //把集合转为数组
        byte[] b = new byte[list.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }
        return b;
    }

    //保证正整数能够用0 补齐
    private static String byteToBitStr(boolean flag, byte b) {
        int tmp = b;
        if (flag) {
            tmp |= 256;
        }
        String res = Integer.toBinaryString(tmp);
        if (flag) {
            return res.substring(res.length() - 8);
        } else {
            return res;
        }
    }

    /**
     * 进行霍夫曼编码压缩的方法
     * 霍夫曼编码才用前缀编码，不会出现重复的现象
     *
     * @param bytes
     * @return
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计每一个byte出现的次数，并放入一个集合中
        List<Node> nodes = getNodes(bytes);
        //创建一棵霍夫曼树
        Node tree = createHuffmanTree(nodes);
        //创建一颗霍夫曼编码表出来
        Map<Byte, String> huffCodes = getCodes(tree);
        //编码
        byte[] b = zip(huffCodes, bytes);
        return b;
    }

    /**
     * 霍夫曼编码
     *
     * @param huffCodes
     * @param bytes
     * @return
     */
    private static byte[] zip(Map<Byte, String> huffCodes, byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        //把需要压缩的byte数组处理成一个二进制的字符串
        for (byte b : bytes) {
            sb.append(huffCodes.get(b));
        }
        //定义长度
        int len;
        if (sb.length() % 8 == 0) {
            len = sb.length() / 8;
        } else {
            len = sb.length() / 8 + 1;
        }
        //用于存储压缩后的byte
        byte[] by = new byte[len];
        //重新定义一个标记
        int index = 0;
        for (int i = 0; i < sb.length(); i += 8) {
            String strByte;
            if (i + 8 > sb.length()) {
                strByte = sb.substring(i);
            } else {
                strByte = sb.substring(i, i + 8);
            }
            byte byt = (byte) Integer.parseInt(strByte, 2);
            by[index++] = byt;
//            System.out.println(strByte);
        }
        return by;
    }

    //用于临时存储路径
    static StringBuilder sb = new StringBuilder();
    //用于临时存储霍夫曼编码
    static Map<Byte, String> huffCodes = new HashMap<>();

    //根据霍夫曼树获取霍夫曼编码
    private static Map<Byte, String> getCodes(Node tree) {
        //递归
        if (tree == null) {
            return null;
        }
        getCodes(tree.left, "0", sb);
        getCodes(tree.right, "1", sb);
        return huffCodes;
    }

    private static void getCodes(Node node, String s, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(s);
        if (node.data == null) {
            getCodes(node.left, "0", sb2);
            getCodes(node.right, "1", sb2);
        } else {
            huffCodes.put(node.data, sb2.toString());
        }
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
//        System.out.println(counts);
        return list;
    }
}
