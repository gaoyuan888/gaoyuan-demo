package cn.gaoyuan.demo.designpattern.builder.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/11 15:57
 * @desc
 */
public class Meal {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : list) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : list) {
            System.out.println("Item name"+item.name());
            System.out.println("Item price"+item.price());
            System.out.println("Item packing"+item.packing().pack());
        }
    }

}
