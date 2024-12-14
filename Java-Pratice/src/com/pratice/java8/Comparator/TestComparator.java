package com.pratice.java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        Student s1 = new Student(32, "Asish");
        Student s2 = new Student(1, "Shivam");
        Student s3 = new Student(2, "shukla");

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before sort"+list);
        Collections.sort(list,(a,b)-> a.id-b.id);

        System.out.println("After sort"+list);



    }
}
