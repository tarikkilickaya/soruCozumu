package Ternary;

import java.util.Scanner;

public class Ternary02_Sayi2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir tam sayı isteyelim
        sayı 10'dan küçükse "Rakam"
        100'den küçükse "İki basamaklı sayı"
        değilse "Üç basamaklı veya daha büyük sayı" yazdıralım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        String sonuc = ((sayi >= 0 && sayi < 10) ? "Rakam" :
                (sayi >= 10 && sayi < 100 ) ? "İki basamaklı sayı" : "Üç basamaklı veya daha büyük sayı");

        System.out.println(sonuc);
    }
}
