package B2;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        System.out.println("---Phan loai hoc sinh---");
        Scanner intString = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String name = intString.nextLine();
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhap diem toan");
        double diemToan = inputInt.nextDouble();
        System.out.println("Nhap diem van");
        double diemVan = inputInt.nextDouble();
        System.out.println("Nhap diem anh");
        double diemAnh = inputInt.nextDouble();
        double TBM = diemToan * diemVan * diemAnh;
        if (TBM >= 8.0) {
            System.out.println("Hoc sinh " + name + " hoc luc gioi");
        } else if (TBM <= 7.5 && TBM >= 6.8) {
            System.out.println("Hoc sinh " + name + " hoc luc kha");
        } else {
            System.out.println("Hoc sinh " + name + " hoc luc trung binh");
        }
    }
}
