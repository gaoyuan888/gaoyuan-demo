package cn.gaoyuan.demo.qa.exercise;


class Person {
    int age;
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/15 14:45
 * @desc
 */
public class TestTransferValue {

    public void changeValue1(int age) {
        age = 30;
    }

    public void changeValue2(Person person) {
        person.setName("xxx");
    }

    public void changeValue3(String str) {
        str = "XXX";
    }

    public static void main(String[] args) {
        int age = 20;
        TestTransferValue test = new TestTransferValue();
        test.changeValue1(age);
        System.out.println(age);

        Person p = new Person();
        p.setName("abc");
        test.changeValue2(p);
        System.out.println(p.getName());

        String str = "abc";
        test.changeValue3(str);
        System.out.println(str);

    }

}
