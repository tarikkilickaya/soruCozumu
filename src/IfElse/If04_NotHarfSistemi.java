package IfElse;

import java.util.Scanner;

public class If04_NotHarfSistemi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden not isteyin.
        Notu harf sistemine çevirip yazdıralım.
        50'den küçükse D
        50-60 arası C
        60-80 arası B
        80 üzeri A
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 100 arasında pozitif bir sayı giriniz");
        double not = scan.nextDouble();

        if (not>=0 && not<50){
            System.out.println("D");
        } else if (not >= 50 && not <60) {
            System.out.println("C");
        } else if (not >= 60 && not <80) {
            System.out.println("B");
        } else if (not >= 80 && not <=100) {
            System.out.println("A");
        } else System.out.println("Lütfen geçerli bir not giriniz");

    }


}



