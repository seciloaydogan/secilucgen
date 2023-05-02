import java.util.Scanner;

public class kdvliodev {
    public static void main(String[] args) {

        int anapara ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Anapara Değeri : ");
        anapara= inp.nextInt();

        double kdvtutari = anapara*0.18, toplamtutar= anapara+kdvtutari;
        System.out.println("Kdv Tutarı : "+ kdvtutari);
        System.out.print("Toplam Tutar : "+toplamtutar);



    }
}





