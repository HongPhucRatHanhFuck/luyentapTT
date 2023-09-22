package B3;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("--- Fizz@Buzz@FizzBuzz ---");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = inputInt.nextInt();
        System.out.println("Nhap b");
        int b = inputInt.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz" + i);
            }
        }
    }
}
