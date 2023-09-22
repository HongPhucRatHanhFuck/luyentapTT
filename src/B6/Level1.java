package B6;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = inputInt.nextInt();

        System.out.println("Các ước số nguyên dương của " + a + " là:");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // In xuống dòng sau khi liệt kê xong ước số.

        System.out.println("Các bội số của " + a + " nhỏ hơn 100 là:");
        for (int i = 1; i * a < 100; i++) {
            int boiso = a * i;
            System.out.print(boiso + " ");
        }
    }
}
