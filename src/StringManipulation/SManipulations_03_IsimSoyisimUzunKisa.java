package StringManipulation;

import java.util.Scanner;

public class SManipulations_03_IsimSoyisimUzunKisa {
    public static void main(String[] args) {

        /*
        Kullanıcıdan isim ve soyisim alıp hangisinin daha uzun olduğu yazdıralım.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("İsim ve soyisim arasından daha uzun olanı : " + isim);
        } else if (soyisim.length() > isim.length()) {
            System.out.println("İsim ve soyisim arasından daha uzun olanı : " + soyisim);
        } else System.out.println("İsim ve soyisim uzunlukları birbirine eşit.");
    }
}
