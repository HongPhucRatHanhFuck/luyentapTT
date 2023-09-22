package B5;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = inputInt.nextInt();
        double S = 100;
        for (int i = 1; i <= n; i++) {
            S += (double) i * (i + 1) / ((i + 1) * (i + 2));
        }
        System.out.println("Tong S la: " + S);
    }

}
