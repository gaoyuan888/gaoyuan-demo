package cn.gaoyuan.demo.test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/9/5 18:51
 * @desc
 */
public class Test {


    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("a","a");
        System.out.println(map);
        String s="aaaa";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        testTransient();
    }
    public static void testTransient(){
        String name1="常规属性",name2="transient修饰的属性";
        TransientTest test = new TransientTest(name1, name2);
        System.out.println("序列化前："+test.toString());
        ObjectOutputStream outStream;
        ObjectInputStream inStream;
        String filePath = "D:/TransientTest.obj";
        try {
            outStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outStream.writeObject(test);

            inStream = new ObjectInputStream(new FileInputStream(filePath));
            TransientTest readObject = (TransientTest)inStream.readObject();
            System.out.println("序列化后："+readObject.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    public static class TransientTest implements Serializable {
        private static final long serialVersionUID = 233858934995755239L;
        private String name1;
        private transient String name2;

        public TransientTest(String name1,String name2){
            this.name1 = name1;
            this.name2 = name2;
        }
        @Override
        public String toString(){
            return String.format("TransientTest.toString(): name1=%s,name2=%s", name1,name2);
        }

        private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
            s.defaultWriteObject();
            s.writeObject(name2);
        }
        private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
            s.defaultReadObject();
            name2=String.valueOf(s.readObject());
        }
    }
}
