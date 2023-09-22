package B4;

public class Level3 {
    public static void main(String[] args) {
        soChinhPhuong(1, 5);
    }

    public static void soChinhPhuong(int x, int y) {
        int tong = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                tong += Math.pow(i, 2);
            }
        }
        System.out.println(tong);
    }
}
