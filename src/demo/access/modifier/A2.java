package demo.access.modifier;
//
//class A2 {
//    static {
//        System.out.println("Khoi static duoc trieu hoi");
//    }
//
//    public static void main(String args[]) {
//        System.out.println("Hello main");
//    }
//}

public class A2 {
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {
        // khai báo sai: A2.C o = new A2.C();

        A2.C o2 = new A2().new C();

        A2.B o3 = new A2.B();

    }
}
