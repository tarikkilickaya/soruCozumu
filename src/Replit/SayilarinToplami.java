package Replit;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        Ornek:
        INPUT :
        25
        46
        OUTPUT :
        Numaralarin Toplami:
        71
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("Sayı giriniz : ");
        int sayi2 = scan.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + (toplam));
    }
}
