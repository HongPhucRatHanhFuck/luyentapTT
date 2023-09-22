package B7;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        System.out.println("Nhap so de in cach doc cua so");
        Scanner inputInt = new Scanner(System.in);
        int a = inputInt.nextInt();
        if (a < 10) {
            switch (a) {
                case 1:
                    System.out.println("Mot");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bon");
                    break;
                case 5:
                    System.out.println("Nam");
                    break;
                case 6:
                    System.out.println("Sau");
                    break;
                case 7:
                    System.out.println("Bay");
                    break;
                case 8:
                    System.out.println("Tam");
                    break;
                case 9:
                    System.out.println("Chin");
                    break;
                default:
                    System.out.println("Sai so nhap vao");
            }
        }

    }
}
