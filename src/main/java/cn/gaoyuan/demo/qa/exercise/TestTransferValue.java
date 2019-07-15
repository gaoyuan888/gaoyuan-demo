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
        System.out.println(System.identityHashCode(age));
    }

    public void changeValue2(Person person) {
        //这里，我们把这种传递也理解为”值传递“只不过这里的值，是一个”引用”的值！
        // 也就是我们把实际参数（一个引用）拷贝一份赋值给形式参数，形式参数进行操作。
        // 当形式参数对本身的对象进行了变动操作，这里的效果跟引用传递是相同的。
        System.out.println(System.identityHashCode(person));
        person.setName("xxx");
    }

    public void changeValue3(String str) {
        str = "XXX";
        System.out.println(System.identityHashCode(str));
    }

    public static void main(String[] args) {

//        基本类型作为参数传递时，是传递值的拷贝，无论你怎么改变这个拷贝，原值是不会改变的
        int age = 20;
        TestTransferValue test = new TestTransferValue();
        System.out.println(System.identityHashCode(age));
        test.changeValue1(age);
        System.out.println(System.identityHashCode(age));
        System.out.println(age);



        Person p = new Person();
        p.setName("abc");
        System.out.println(System.identityHashCode(p));
        test.changeValue2(p);
        System.out.println(System.identityHashCode(p));
        System.out.println(p.getName());

        String str = "abc";
        System.out.println(System.identityHashCode(str));
        test.changeValue3(str);
        System.out.println(System.identityHashCode(str));
        System.out.println(str);

    }

}
