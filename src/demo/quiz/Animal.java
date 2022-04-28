package demo.quiz;

public class Animal {

    // private: Compile-time error
    // private void speak(){
    public void speak(){
        System.out.println("Hello");

    }

}


class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.speak();

    }

}