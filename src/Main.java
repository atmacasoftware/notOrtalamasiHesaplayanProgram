import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişken Tanımları
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alma
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Not Ortalamanız : " + sonuc);

        if(sonuc > 60.0){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }



    }
}