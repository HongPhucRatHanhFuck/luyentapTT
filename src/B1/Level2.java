package B1;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("===Find the largest number among 3 numbers===");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = inputInt.nextInt();
        System.out.println("Enter number b: ");
        int b = inputInt.nextInt();
        System.out.println("Enter number c: ");
        int c = inputInt.nextInt();
        if (a > b && a > c){
            System.out.println("Num a is max: " + a);
        }
        if (b > c && b > a){
            System.out.println("Num b is max: " + b);
        }
        if (c > a && c > b){
            System.out.println("Num c is max: " + c);
        }
        System.out.println("----- End -----");
    }
}
