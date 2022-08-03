package Replit;

import java.util.Scanner;

public class AydaKacGunVar {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ay numarası giriniz : ");
        int ayNo = scan.nextInt();
        System.out.print("Yıl giriniz : ");
        int yil = scan.nextInt();
        
        int ayGun = 0;
        String ayAdi = "";

        if (ayNo == 1) {
            ayGun = 31;
            ayAdi = "Ocak";
        } else if (ayNo == 2) {
            if (yil % 4 == 0) {
                ayGun = 29;
            } else {ayGun = 28;
            }
            ayAdi = "Şubat";
        } else if (ayNo == 3) {
            ayGun = 31;
            ayAdi = "Mart";
        } else if (ayNo == 4) {
            ayGun = 30;
            ayAdi = "Nisan";
        } else if (ayNo == 5) {
            ayGun = 31;
            ayAdi = "Mayıs";
        } else if (ayNo == 6) {
            ayGun = 30;
            ayAdi = "Haziran";
        } else if (ayNo == 7) {
            ayGun = 31;
            ayAdi = "Temmuz";
        } else if (ayNo == 8) {
            ayGun = 31;
            ayAdi = "Ağustos";
        } else if (ayNo == 9) {
            ayGun = 30;
            ayAdi = "Eylül";
        } else if (ayNo == 10) {
            ayGun = 31;
            ayAdi = "Ekim";
        } else if (ayNo == 11) {
            ayGun = 30;
            ayAdi = "Kasım";
        } else if (ayNo == 12) {
            ayGun = 31;
            ayAdi = "Aralık";
        }
        System.out.println((ayAdi) + ", " + (yil) + ", " + (ayGun) + " gündür");
    }
}
