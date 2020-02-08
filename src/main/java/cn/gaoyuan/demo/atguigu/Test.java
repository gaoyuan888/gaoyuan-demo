package cn.gaoyuan.demo.atguigu;

import org.springframework.beans.BeanUtils;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/29 15:36
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Student student= new Student();
        student.setAge(11);
        Student.Grade g = new Student.Grade();
        g.setGrade(111);
        student.setFrom(g);


        SS s=new SS();
        BeanUtils.copyProperties(student,s);
        System.out.println(s);
    }
}

class Student{
    int age;
    Student.Grade from;

    public Grade getFrom() {
        return from;
    }

    public void setFrom(Grade from) {
        this.from = from;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static class Grade{
        Integer grade;

        public Integer getGrade() {
            return grade;
        }

        public void setGrade(Integer grade) {
            this.grade = grade;
        }
    }

}



class SS{
    int age;
    SS.Grade from;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grade getFrom() {
        return from;
    }

    public void setFrom(Grade from) {
        this.from = from;
    }

    static class Grade{
        Integer grade;

        public Integer getGrade() {
            return grade;
        }

        public void setGrade(Integer grade) {
            this.grade = grade;
        }
    }
}

