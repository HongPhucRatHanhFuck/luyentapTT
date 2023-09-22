package B4;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        System.out.println("Tinh tong a den b");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = inputInt.nextInt();
        System.out.println("Nhap b: ");
        int b = inputInt.nextInt();
        int tong = 0;
        for (int i = a; i <= b; i++) {
        tong += i;
        }
        System.out.println(tong);
    }
}
