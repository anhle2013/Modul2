package dsa_stack_queue.demerging;

import java.time.LocalDate;

public class Student {
    private String name;
    private String gender;
    private LocalDate dateOfBirth;
    public Student(String name, String gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "\t" + gender + ", " + dateOfBirth + ", " + name;
    }

}
