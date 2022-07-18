package WhileLoop;

import java.util.Scanner;

public class WhileLoop_TamBolen {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        // olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        int tamBolen = 1;
        int tamBolenSayisi = 0;

        System.out.print("Girilen " + sayi + " değerini tam bölen sayılar : ");
        while (tamBolen <= sayi) {
            if (sayi % tamBolen == 0) {
                System.out.print(tamBolen + " ");
                tamBolenSayisi++;
            }
            tamBolen++;
        }
        System.out.println("");
        System.out.println(sayi + " değerinin tam bölen sayısı : " + tamBolenSayisi);
    }
}

