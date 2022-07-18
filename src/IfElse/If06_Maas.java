package IfElse;

import java.util.Scanner;

public class If06_Maas {
    public static void main(String[] args) {

        /*
         Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gere cevap yazdirin.
         Teklif 80.000'in uzerinde ise "Kabul ediyorum" ,
         60 - 80.000 arasinda ise "Konusabiliriz",
         60.000'nin altinda ise "Maalesef Kabul edemem" yazdirin
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen maaş için teklif ettiğiniz tutarı giriniz");
        double tutar = scan.nextDouble();

        if (tutar < 60000) {
            System.out.println("Maalesef kabul edemem");
        } else if (tutar >= 60000 && tutar <= 80000) {
            System.out.println("Konuşabiliriz");
        } else if (tutar > 80000) {
            System.out.println("Kabul ediyorum");
        }
    }
}

