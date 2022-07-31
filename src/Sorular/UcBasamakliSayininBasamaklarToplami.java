package Sorular;

import java.util.Scanner;

public class UcBasamakliSayininBasamaklarToplami {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

        Örnek Çıktı:

        Verilen tamsayının rakamları toplamı 10'dur.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz : ");
        int input = scan.nextInt();
        int basamakToplami = 0;

        while (input != 0) {
            basamakToplami = (input % 10) + basamakToplami;
            input /= 10;
        }
        System.out.println("Verilen tam sayının rakamları toplamı : " + basamakToplami);
    }
}
