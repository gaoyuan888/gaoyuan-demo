package cn.gaoyuan.demo.algorithm.datastucture.recursive;

import org.junit.Test;

/**
 * 递归-汉诺塔问题
 */
public class Hanoi {

    @Test
    public void test(){
        han(2,"A","B","C");
    }

    private void han(int n,String from,String in,String to){
        if(n==1){
            System.out.println("第1个从"+from+"到"+to+"位置");
        }else{
            han(n-1,from,to,in);
            System.out.println("第"+n+"个从"+from+"到"+to);
            han(n-1,in,from,to);
        }

    }
}
