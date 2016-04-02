package me.ggikko.generic;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Park Ji Hong, ggikko.
 */
public class University {


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setLevel(10);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        Stream.of(students).forEach(st -> System.out.printf("student's level : " + st.get(0).getLevel()));

        ArrayList<String> arrayList = new ArrayList<>();

    }

    class Generic<T>{
        Generic<T> generic;
    }




}
