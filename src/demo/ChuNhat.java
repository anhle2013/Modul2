class ChuNhat {
    public int rong, dai;

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}

class Test {
    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        Test o = new Test();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}
//x = 5, y = 5