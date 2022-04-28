package access_modifier_and_static.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    String getName() {
        return this.name;
    }
    String setName(String name) {
        return this.name = name;
    }

    String getEngine() {
        return this.engine;
    }
    String setEngine(String engine) {
        return this.engine = engine;
    }
}
