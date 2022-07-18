package IfElse;

import java.util.Scanner;

public class If07_PozitifNegatifSayi {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin,
        sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        sayilardan sifira esit olan varsa "sifir carpmaya gere yutan elemandir" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("Sıfır çarpmaya göre yutan elemandır.");
        } else if (x > 0 && y > 0) {
            System.out.println("Sayıların toplamı : " + (x + y));
        } else if (x < 0 && y < 0) {
            System.out.println("Sayıların çarpımı : " + (x*y));
        } else if (x<0 || y>0 && x>0 || y<0) {
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsın");
        }

    }
}
