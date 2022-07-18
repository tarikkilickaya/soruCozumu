package Ternary;

import java.util.Scanner;

public class Ternary01_BuyukOlmayanSayi {
    public static void main(String[] args) {


        // Kullanıcıdan iki sayı alın ve büyük olmayan sayıyı yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc = (sayi1 < sayi2) ? sayi1 : sayi2;
        System.out.println(sonuc);

    }
}
