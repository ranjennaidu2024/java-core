package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ranjen",32,"ST001"));
        students.add(new Student("Babu",30,"ST002"));
        students.add(new Student("Abu",31,"ST003"));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        for(Student student:students){
            System.out.println("Name: "+student.getName()
                    + ", Age: "+student.getAge() +
                    ", Student No: "+student.getStudentNo());
        }
    }


}
