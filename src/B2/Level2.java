package B2;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("$$$Lai suat ngan hang$$$");
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        int soTienGui = inputInt.nextInt();
        System.out.println("Nhap lai suat %: ");
        double laiSuat = inputInt.nextDouble();
        System.out.println("Nhap so ngay da gui: ");
        int soNgayGui = inputInt.nextInt();
        double soTienLai = (soTienGui * laiSuat) / 100 * soNgayGui / 365;
        System.out.println("So tien lai la:" + soTienLai);
    }
}
