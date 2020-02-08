package cn.gaoyuan.demo.atguigu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class MyShare1 {
    private AtomicInteger integer=new AtomicInteger();
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();


    public void printSingle(){
        lock.lock();
        try {
            while (integer.get()<100){
                while (integer.get()%2==0){
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName()+"/"+integer.get());

                integer.getAndIncrement();
                condition.signalAll();
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printDoub(){
        lock.lock();
        try {

            while (integer.get()<100){
                while (integer.get()%2!=0){
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName()+"/"+integer.get());
                integer.getAndIncrement();
                condition.signalAll();
            }



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }



}

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/23 21:53
 * @desc
 */
public class Solution {
    public static void main(String[] args) {
        MyShare1 myShare1=new MyShare1();
        new Thread(()->{
            myShare1.printSingle();
        },"AA").start();


        new Thread(()->{
            myShare1.printDoub();
        },"BB").start();
    }

}
