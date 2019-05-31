package cn.gaoyuan.demo.algorithm.hashdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/26 20:49
 * @desc
 */
public class HashTableTest {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(16, 2);
        StudentInfo s2 = new StudentInfo(17, 3);
        StudentInfo s3 = new StudentInfo(18, 4);
        StudentInfo s4 = new StudentInfo(19, 5);
        StudentInfo s5 = new StudentInfo(12, 7);
        HashTable ht = new HashTable();
        ht.put(s1);
        ht.put(s2);
        ht.put(s3);
        ht.put(s4);
        ht.put(s5);


        StudentInfo studentInfo = new StudentInfo(18);
        StudentInfo studentInfo1 = ht.get(studentInfo);
        System.out.println(studentInfo1);

        Map map=new HashMap<>();
    }

}
