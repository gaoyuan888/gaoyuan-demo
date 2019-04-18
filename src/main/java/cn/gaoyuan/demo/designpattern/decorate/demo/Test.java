package cn.gaoyuan.demo.designpattern.decorate.demo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/18 19:56
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        //啤酒
        Drink beer=new QingDaoDecorator(new BearDrink());
        System.out.println(beer.name()+":"+beer.price());

        Drink yj= new YanJingDecorator(new BearDrink());
        System.out.println(yj.name()+":"+yj.price());

        //可乐
        Drink baishi=new BaiShiDecorator(new ColaDrink());
        System.out.println(baishi.name()+":"+baishi.price());
    }
}
