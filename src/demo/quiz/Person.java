package demo.quiz;

public class Person {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Customer();

        Person person1 = new Customer();
        Person person2 = new Employee();

        Person[] persons = new Person[5];
        persons[0] = new Employee();
    }
}
class Employee extends Person {}
class Customer extends Person {}