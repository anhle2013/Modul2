package abstract_and_interface.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String howtoeat() {
        return "Chicken could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
