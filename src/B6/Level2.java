package B6;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = inputInt.nextInt();


        // Tìm ước số nguyên lẻ lớn nhất của a
        int uocSoLeLonNhat = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && i % 2 == 1) {
                uocSoLeLonNhat = i;
            }
        }

        // Liệt kê bội số chẵn nhỏ nhất của a
        int boiSoChanNhoNhat = a;
        for (int i = 1; i <= a * 2; i++) {
            if (i % a == 0 && i % 2 == 0) {
                boiSoChanNhoNhat = i;
                break; // Dừng vòng lặp khi tìm được bội số chẵn nhỏ nhất.
            }
        }

        System.out.println("Ước số nguyên lẻ lớn nhất của " + a + " là: " + uocSoLeLonNhat);
        System.out.println("Bội số chẵn nhỏ nhất của " + a + " là: " + boiSoChanNhoNhat);
    }
}
