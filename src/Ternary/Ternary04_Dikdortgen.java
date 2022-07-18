package Ternary;

import java.util.Scanner;

public class Ternary04_Dikdortgen {
    public static void main(String[] args) {

        /*
        Kullanıcıdan dörtgenin uzunluğunu ve genişliğini alalım ve
        girilen sonuçlara göre dörtgenin kare olup olmadığını yazdılarım.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dörtgenin uzunluğunu giriniz");
        int uzunluk = scan.nextInt();
        System.out.println("Lütfen dörtgenin enini giriniz");
        int en = scan.nextInt();

        String sonuc = (en == uzunluk) ? "Bu dörtgen bir karedir." : "Bu dörtgen bir kare değildir.";

        System.out.println(sonuc);




    }
}
