package demo.access.modifier;

class Counter {
    int count = 0;
    /*se lay bo nho (memory) khi bien instance duoc tao*/

    /*Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong*/
    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
/* int count = 0 thì kq là 1 1 1
Do mỗi lần tạo Object thì biến count lại đc khởi tạo từ đầu

static int count = 0 thì kq 1 2 3
Do biến static chỉ tạo 1 lần lúc load JVM
Mỗi khi tạo Object mới thì tự động thực hiện Contructor nên tự động tăng count
 */