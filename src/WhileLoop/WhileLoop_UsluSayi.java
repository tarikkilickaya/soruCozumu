package WhileLoop;

import java.util.Scanner;

public class WhileLoop_UsluSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, sonuc = 1;

        System.out.print("Lütfen üssü alınacak sayıyı giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        sayi2 = scan.nextInt();
        int i = 1;

        while (i <= sayi2){
            sonuc *= sayi1;
            i++;
        }
        System.out.print("Sonuç : " + sonuc);
    }
}