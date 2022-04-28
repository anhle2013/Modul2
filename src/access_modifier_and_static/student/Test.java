package access_modifier_and_static.student;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Nguyen");
        st1.setClasses("A2");
        System.out.println(st1);
    }
}
