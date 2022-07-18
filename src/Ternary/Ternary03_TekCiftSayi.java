package Ternary;

import java.util.Scanner;

public class Ternary03_TekCiftSayi {
    public static void main(String[] args) {

        // Kullanıcıdan bir tam sayı alıp tek mi çift mi olduğunu yazdıralım.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println((sayi % 2 == 0) ? "Sayı çifttir" : "Sayı tektir");
    }
}
