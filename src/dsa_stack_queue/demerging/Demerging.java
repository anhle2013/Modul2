package dsa_stack_queue.demerging;
import dsa_stack_queue.queue_array.MyQueue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Demerging {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("anh","male",LocalDate.of(1999,1,20)));
        students.add(new Student("quynh","male",LocalDate.of(1999,11,20)));
        students.add(new Student("hanh","male",LocalDate.of(1992,5,10)));
        students.add(new Student("hoang","female",LocalDate.of(1992,12,22)));
        students.add(new Student("phi","male",LocalDate.of(1992,5,20)));
        students.add(new Student("nguyen","male",LocalDate.of(1997,10,12)));
        students.add(new Student("minh","male",LocalDate.of(1997,1,2)));
        students.add(new Student("hieu","female",LocalDate.of(1998,9,30)));
        students.add(new Student("manh","male",LocalDate.of(1998,2,3)));
        students.add(new Student("quy","female",LocalDate.of(1998,2,3)));
        students.add(new Student("thanh","male",LocalDate.of(1998,2,3)));
        students.add(new Student("tinh","female",LocalDate.of(1998,2,3)));

        students.sort(Comparator.comparing(Student::getDateOfBirth));

        System.out.println("List sorted by date of birth:");
        for (Student student: students)
            System.out.println(student);


        MyQueue<Student> male = new MyQueue<>(10);
        MyQueue<Student> female = new MyQueue<>(10);
        for (Student student: students) {
            if (student.getGender().equals("male"))
                male.enqueue(student);
            if (student.getGender().equals("female"))
                female.enqueue(student);
        }

        ArrayList<Student> studentsByGender = new ArrayList<>();
        while (!female.isEmpty()) {
            studentsByGender.add(female.dequeue());
        }
        while (!male.isEmpty()) {
            studentsByGender.add(male.dequeue());
        }
        System.out.println("\nList sorted by gender with date of birth:");
        for (Student student: studentsByGender)
            System.out.println(student);

        studentsByGender.sort(Comparator.comparing(Student::getDateOfBirth));
        System.out.println("\nList sorted by gender and date of birth:");
        for (Student student: studentsByGender)
            System.out.println(student);
    }
}
