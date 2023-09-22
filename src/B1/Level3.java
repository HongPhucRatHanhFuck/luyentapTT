package B1;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        System.out.println("Triangle: ");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = inputInt.nextInt();
        System.out.println("Enter b: ");
        int b = inputInt.nextInt();
        System.out.println("Enter c: ");
        int c = inputInt.nextInt();
        if(a == b && a == c){
            System.out.println("Equilateral triangle ");
        }
    }
}
