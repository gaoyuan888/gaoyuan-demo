package cn.gaoyuan.demo.qa.jvmparams;

import java.util.Calendar;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/16 19:37
 * @desc
 */
public class RunTimeDemo {

    public static void main(String[] args) {
        ConcurrentHashMap map=new ConcurrentHashMap();



        Calendar c = Calendar.getInstance();
// 当前日期是本月第几周
        int weeks = c.get(Calendar.WEEK_OF_MONTH);

        System.out.println(weeks);
//        Long ss = 1254L;
//        System.out.println(ss.intValue());
//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
////        java.lang.OutOfMemoryError: Java heap space
//        byte[] bytes = new byte[1024 * 1024 * 1500];
//        System.out.println("good 11111");
//        bytes.toString();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

    }



}
