import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cvp = new Scanner(System.in);

        System.out.println("Fyati giriniz: ");
        double fiyat = cvp.nextDouble();

        double kdv = fiyat < 1000 ? fiyat*0.18 : fiyat*0.08;


        System.out.println("KDV'siz tutar " + fiyat);
        System.out.println("KDV'li tutar = "+ (fiyat + kdv));
        System.out.println("KDV tutarı = " + kdv);
    }
}