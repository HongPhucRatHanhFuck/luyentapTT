package B3;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        System.out.println("In ra cac so chinh phuong a va b");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = inputInt.nextInt();
        System.out.println("Nhap so b");
        int b = inputInt.nextInt();
        for (int i = a; i <= b ; i++) {
            if (i % 2 ==0){
                System.out.println("Cac so chinh phuong la " + i);
            }
        }
    }
}
