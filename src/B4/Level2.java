package B4;

public class Level2 {
    public static void main(String[] args) {
        soChan(1, 10);
    }
    public static void soChan(int a, int b){
        int tong = 0;
        for (int i = a; i <= b ; i++) {
           if(i % 2 ==0){
               tong += i;
           }
        }
        System.out.println("Tong so chan la: " + tong);
    }
}
