package cn.gaoyuan.demo;

import java.math.BigDecimal;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2020/2/27 10:12
 * @desc
 */
public class TestDecimal {

    public static void main(String[] args) {
        BigDecimal bd1=new BigDecimal(0.50);
        BigDecimal bd2=new BigDecimal(0.27);
        BigDecimal res=bd1.subtract(bd2);
        System.out.println(res);

    }
}
