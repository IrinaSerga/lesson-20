package lesson21;

import java.util.ArrayList;
import java.util.List;

public class Student {

    int age;
    String name;
    List<Integer> marks = new ArrayList<>();

    public Student(int age, String name) {
        this.age = age;
        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
