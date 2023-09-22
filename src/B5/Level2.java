package B5;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap n tinh phuong trinh ");
        int n = inputInt.nextInt();

        double S = 0;
        for (int i = 1; i <= n ; i++) {
            double numerator = 2 * i - 1;
            double denominator = 2 * i;
            double term = numerator / denominator;
            S += term;
        }
        System.out.println("Gia tri cua S la: " + S);

    }
}

