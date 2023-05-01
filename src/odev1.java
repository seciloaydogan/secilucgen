import java.util.Scanner;
public class odev1 {
    public static void main(String[] args) {
        // önce değişkenlerini oluştur

        int mat,fizik,kimya,turkce,tarih,muzik;

        //bunun için kullanıcıdan değer almam lazım. scanner sınıfı neydi?
        //kullanıcıdan değer almayı sağlayan bir sınıftı
        //scanner sınıfını sisteme dahil etmek için yukarıya import java....yazısını yazacağız
        //scanner ı tanımladık kullanabilmek için ise bir nesne üretmemiz lazım o zaman scanner inp veya input veya
        //ne istersen onu yazacaksın

        Scanner inp = new Scanner(System.in);
                // artık kullanıcıdan değerleri alabiliriz. hangilerini gireceğini yazdıralım.
        // önce kullananıcıya matematik değerini alacağımızı söylyeyelim

       System.out.print( "Matematik notunuz :");
       mat = inp.nextInt();
       System.out.println(mat);

       System.out.print("Fizik Notunuz : ");
       fizik = inp.nextInt();
        System.out.println(fizik);


       System.out.print("Kimya Notunuz : ");
       kimya = inp.nextInt();
        System.out.println(kimya);


        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        System.out.println(kimya);


        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.println(tarih);

        // System.out.println(kimya);kısımları olmasada olur böylece direk yazarsın

        double toplam = ( mat+kimya+fizik+muzik+turkce+tarih);
        double sonuc = ( toplam/6.0);
        System.out.println(" Not Ortalamanız : " +sonuc);

        boolean kaldiniz =sonuc < 60 ;
        boolean gectiniz = sonuc >= 60;
        boolean mevcut = kaldiniz || gectiniz ;

        String neolacak = sonuc < 60 ? "Kaldınız" : "Geçtiniz";

        System.out.println( neolacak);



    }
}