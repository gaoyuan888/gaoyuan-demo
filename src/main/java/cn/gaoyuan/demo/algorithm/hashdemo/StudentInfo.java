package cn.gaoyuan.demo.algorithm.hashdemo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/26 20:48
 * @desc
 */
public class StudentInfo {
    private int age;
    private int count;


    public StudentInfo(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    public StudentInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "StudentInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
