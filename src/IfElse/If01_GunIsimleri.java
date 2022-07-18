package IfElse;

import java.util.Scanner;

public class If01_GunIsimleri {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gun isimlerini yazdirin
        //Örnek: ilkHarf=P output = “Pazar, Pazartesi veya Perşembe" ilkHarf=S output = "Sali”
        //*** Buyuk kucuk harf problem olmamasi için toUpperCase methodunu kullanin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün isimlerinden birinin ilk harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P') {
            System.out.println(ilkHarf + " ile başlayan günler: " + "Pazartesi, " + "Perşembe, " + "Pazar");
        } else if (ilkHarf == 'S') {
            System.out.println(ilkHarf + " ile başlayan günler: " + "Salı");
        } else if (ilkHarf == 'Ç') {
            System.out.println(ilkHarf + " ile başlayan günler: " + "Çarşamba");
        } else if (ilkHarf == 'C') {
            System.out.println(ilkHarf + " ile başlayan günler: " + "Cuma, " + "Cumartesi");
        } else System.out.println("Lütfen P, S, Ç, C harflerinden birini giriniz");


    }
}


