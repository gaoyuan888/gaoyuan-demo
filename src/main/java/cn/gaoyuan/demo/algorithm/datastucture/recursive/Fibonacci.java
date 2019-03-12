package cn.gaoyuan.demo.algorithm.datastucture.recursive;

import org.junit.Test;

/**
 * 递归-斐波那契数列
 */

public class Fibonacci {

    @Test
    public void test(){
        System.out.println(fibo(4));
    }

    public int fibo(int i){
        if (i==0||i==1) {
            return 1;
        }else{
            return fibo(i-1)+fibo(i-2);
        }
    }
}
