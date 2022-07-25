package Ternary;

import java.util.Scanner;

public class Ternary05_UcBasamakliSayi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir sayı alalım ve sayı üç basamaklıysa
        "Üç basamaklı sayı" değilse "Üç basamaklı değil" yazdıralım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        String sonuc = (sayi >= 100 && sayi <= 999 || sayi <= -100 && sayi >= -999) ?
                "Üç basamaklı sayı" : "Üç basamaklı değil";

        System.out.println(sonuc);
    }
}