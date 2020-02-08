package cn.gaoyuan.demo.atguigu;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/29 15:08
 * @desc
 */
public class TestAbAb {

    public static void main(String[] args) {
        Myshare myshare=new Myshare();
        new Thread(()->{
            while (true){
                myshare.printA();
            }
        },"AA").start();

        new Thread(()->{
            while (true){
                myshare.printB();
            }
        },"BB").start();

        new Thread(()->{
            while (true){
                myshare.printC();
            }
        },"CC").start();
    }
}


class Myshare {
    Lock lock = new ReentrantLock();
    Condition c = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();
    private String str ="";
    public void printA() {
        lock.lock();
        try {
            while (str.equals("B")||str.equals("C")){
                try {
                    c.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(str);

            str="B";
            c2.signal();
        }finally {
            lock.unlock();
        }
    }
    public void printB() {
        lock.lock();
        try {
            while (str.equals("C")||str.equals("A")){
                try {
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(str);

            str="C";

            c3.signal();
        }finally {
            lock.unlock();
        }
    }

    public void printC() {
        lock.lock();
        try {
            while (str.equals("B")||str.equals("A")){
                try {
                    c3.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(str);
            str="A";
            c.signal();
        }finally {
            lock.unlock();
        }
    }


}
