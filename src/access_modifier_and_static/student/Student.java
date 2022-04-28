package access_modifier_and_static.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {

    }
    protected String setName(String name) {
        return this.name = name;
    }
    String setClasses(String classes) {
        return this.classes = classes;
    }
    public String toString() {
        return "{ name: " + this.name + ", classes: " + this.classes + " }";
    }
}
