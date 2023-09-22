package B6;

public class Level3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 122;
        int soDu = a % b;
        while(soDu != 0){
            a = b;
            b = soDu;
            soDu = a % b;
        }
        System.out.println("USCLN: " + b);

    }

}
