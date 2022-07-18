package IfElse;

import java.util.Scanner;

public class If03_KutsalGun {
    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin eğer gun “Cuma” ise ekrana “Muslumanlar için kutsal gun” yazdirin.
        "Cumartesi" ise ekrana “Yahudiler için kutsal gun” yazdirin.
        “Pazar” ise ekrana “Hiristiyanlar için kutsal gun” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gunIsmi = scan.nextLine().toUpperCase();

        if (gunIsmi.equals("CUMA")) {
            System.out.println(gunIsmi + " Müslümanlar için kutsal gün");
        } if (gunIsmi.equals("CUMARTESİ")) {
            System.out.println(gunIsmi + " Yahudiler için kutsal gün");
        } if (gunIsmi.equals("PAZAR")) {
            System.out.println(gunIsmi + " Hristiyanlar için kutsal gün");
        }

    }
}

