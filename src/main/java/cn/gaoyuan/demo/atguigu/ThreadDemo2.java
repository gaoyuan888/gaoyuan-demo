package cn.gaoyuan.demo.atguigu;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Myshare2{
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    Lock lock=new ReentrantLock();
    Condition c1=lock.newCondition();
    Condition c2=lock.newCondition();
    Condition c3=lock.newCondition();

    public void print1(){
        lock.lock();
        try {
            while (atomicInteger.get()<100){
                while (atomicInteger.get()%3!=0){
                    c1.await();
                }
                System.out.println(Thread.currentThread().getName()+"/"+atomicInteger.get());
                atomicInteger.incrementAndGet();
                c2.signal();
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }



    }
    public void print2(){
        lock.lock();
        try {
            while (atomicInteger.get()<100){
                while (atomicInteger.get()%3!=1){
                    c2.await();
                }
                System.out.println(Thread.currentThread().getName()+"/"+atomicInteger.get());
                atomicInteger.incrementAndGet();
                c3.signal();
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void print3(){
        lock.lock();
        try {
            while (atomicInteger.get()<100){
                while (atomicInteger.get()%3!=2){
                    c3.await();
                }
                System.out.println(Thread.currentThread().getName()+"/"+atomicInteger.get());
                atomicInteger.incrementAndGet();
                c1.signal();
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
 * @date 2019/10/23 22:11
 * @desc
 */
public class ThreadDemo2 {

    public static void main(String[] args) {
        Myshare2 myshare2=new Myshare2();

        new Thread(()->{
            myshare2.print1();
        },"0").start();



        new Thread(()->{
            myshare2.print2();
        },"1").start();


        new Thread(()->{
            myshare2.print3();
        },"2").start();
    }
}
