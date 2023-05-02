
import java.util.Scanner;
public class ucgenalanhesaplama {
    public static void main(String[] args) {

        double a,b,c,alan, cevre, u;
        Scanner giris = new Scanner(System.in);

        System.out.print("a kenarı :");
        a=giris.nextDouble();

        System.out.print("b kenarı : ");
        b=giris.nextDouble();

        System.out.print("c kenarı :");
        c=giris.nextDouble();

        cevre= a+b+c ;
        System.out.println("Üçgenin Çevresi (2u) :"+cevre);

        u= cevre/2;
        System.out.println(" u= (Üçgenin Çevresi)/2 :" +u);

        alan= Math.sqrt( u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı:"+alan);





    }
}
