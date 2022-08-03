package Replit;

import java.util.Scanner;

public class HarfKacKezVar {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isim giriniz : ");
        String isim = scan.nextLine();
        System.out.print("Bir karakter giriniz : ");
        char karakter = scan.nextLine().charAt(0);
        int sayac = 0;


        for (int i = 0; i < isim.length(); i++) {
            if (karakter == isim.charAt(i)) {
                sayac++;
            }
        }
        System.out.println("Girilen " + isim + " ifadesi " + sayac + " tane " + karakter + " içeriyor");
    }
}