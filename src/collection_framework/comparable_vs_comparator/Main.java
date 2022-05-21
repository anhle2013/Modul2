package collection_framework.comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 21, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Kien",24,"HN");
        Student student4 = new Student("Ha", 22, "HN");

        System.out.println("Comparable (Sort by name):");
        List<Student> lists = new ArrayList<>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student student: lists)
            System.out.println(student);

        System.out.println();
        System.out.println("Comparator (Sort by age):");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        for (Student student: lists)
            System.out.println(student);

    }
}
