package cn.gaoyuan.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest implements App11


{

    public static void main(String[] args) {
        Integer s=null;
        System.out.println(s==0);

//        System.out.println(Float.MAX_VALUE);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void test(){
        System.out.println("fdafdsafds");
    }

    @Override
    public void print() {

    }
}
