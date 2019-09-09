package cn.gaoyuan.demo.stringdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * 最长无重复子串长度
 * @author yaoyizhou
 * @date 2019/9/9 17:02
 * @desc
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println(solution("abcdefg"));
    }

    public static int solution(String s) {
        char[] chars = s.toCharArray();
        int max = 1;
        int maxIndex = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(chars[0], 0);
//        map.put(chars[1], 1);


        for (int i = 1; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int last = map.get(chars[i]);
                int plast = map.get(chars[i - 1]);
                if (plast >= last) {
                    max = Math.max(max, i - last);
                    maxIndex = plast;
                }
            } else {
                max = Math.max(i - maxIndex+1,max);
            }
            map.put(chars[i], i);
        }

        return max;
    }
}
