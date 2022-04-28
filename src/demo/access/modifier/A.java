package demo.access.modifier;

class A {
    protected void msg() {
        System.out.println("Hello java");
    }
}

class Simple extends A {
    public void msg() {
    //void msg() {
        // Compile Time Error do default level thấp hơn protected (đã khai báo hàng 4)
        System.out.println("Hello java");
    }


    public static void main(String args[]) {
        Simple obj = new Simple();
        obj.msg();
    }
}