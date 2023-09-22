package B5;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }

        System.out.println("Tổng S = " + sum);
    }
}
