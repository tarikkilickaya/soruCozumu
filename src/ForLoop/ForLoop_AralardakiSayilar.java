package ForLoop;

import java.util.Scanner;

public class ForLoop_AralardakiSayilar {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı isteyin, girilen ve aradaki sayıların toplamını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplam = 0;

        for (int i = sayi1; i <= sayi2 ; i++) {
            toplam += i;
        }

        System.out.println("Girdiğiniz " + sayi1 + " ile " + sayi2 + " arasındaki sayıların toplamı : " + toplam);
    }
}
