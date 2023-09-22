package B3;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        System.out.println("In ra cac so tu a den b");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = inputInt.nextInt();
        System.out.println("Nhap so b");
        int b = inputInt.nextInt();
        for (int i = a; i < b ; i++) {
            System.out.println("Cac so tu a den b la: " + i);
        }
    }
}
