package Replit;

import java.util.Scanner;

public class SayiyiTerseCevir {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Girdiğiniz sayının tersten yazılısı : ");
        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}