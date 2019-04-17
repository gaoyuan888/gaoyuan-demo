package cn.gaoyuan.demo.designpattern.prototype.demo1;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/17 19:46
 * @desc
 */
public class Resume implements Cloneable{
    private String name;
    private int age;
    private String[] hobby;

    public Resume(){
       // 这里面构造函数特别复杂，通过new构造对象非常复杂，这是需要原型模式
//        .........
//        .........
//        .........
//        .........
        System.out.println("调用了无参构造");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    protected Object clone(){
        try {
//            深克隆
            Resume rs=(Resume) super.clone();
            rs.hobby=rs.getHobby().clone();
            return rs;

//            浅克隆-只重写父类的克隆方法，这就是浅克隆
//            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}'+super.toString();
    }
}
