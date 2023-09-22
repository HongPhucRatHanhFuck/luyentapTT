package B1;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Number you want test is: ");
        int n = inputInt.nextInt();
        if (n % 2 ==0){
            System.out.println("Here is odd number: " + n);
        }else {
            System.out.println("Here is even number: " + n);
        }

    }

}
