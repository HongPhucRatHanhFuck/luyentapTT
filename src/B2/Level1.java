package B2;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        System.out.println("--- Ran banh ---");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("--Nhap so banh can ran--");
        int a = inputInt.nextInt();
        if (a >= 1 && a <= 1000) {
            if (a % 3 == 0) {
                System.out.println("So lan ran phai ran la: " + a / 3);
            }else{
                System.out.println("Vi chi ran duoc tu 1 den 9 nen lan nay ran duoc: " + a%3);
            }
        }
    }
}
