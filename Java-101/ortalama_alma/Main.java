import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            float mat, fizik, kimya, turkce, tarih, muzik;

            Scanner cvp = new Scanner(System.in);
            
            System.out.print("Matematik notunuz: ");
            mat =cvp.nextFloat();
            System.out.print("Fizik notunuz: ");
            fizik =cvp.nextFloat();
            System.out.print("Kimya notunuz: ");
            kimya =cvp.nextFloat();
            System.out.print("Türkçe notunuz: ");
            turkce =cvp.nextFloat();
            System.out.print("Tarih notunuz: ");
            tarih =cvp.nextFloat();
            System.out.print("Müzik notunuz: ");
            muzik =cvp.nextFloat();

            float ort = (mat + fizik + kimya + turkce + tarih + muzik)/6;

            System.out.println(ort);

            String str= ort>=60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
            System.out.println(str);
    }
}