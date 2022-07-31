package Sorular;

import java.util.Scanner;

public class DoubleTamSayiyaDonustur {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen double türünde bir sayı giriniz : ");
        double input = scan.nextDouble();

        int tamSayi = (int) input;

    }
}
