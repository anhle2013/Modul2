package abstract_and_interface.animal;

public class Apple extends Fruit implements Edible{
    @Override
    public String howtoeat() {
        return "Apple could be slided";
    }
}
