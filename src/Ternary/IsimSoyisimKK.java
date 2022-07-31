package Ternary;

import java.util.Scanner;

public class IsimSoyisimKK {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output :
        Name :
        J*** W****
        CCN : **** **** **** 1478
        Ilk Harfler Buyuk harf ile baslamalidir.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("İsim giriniz : ");
        String isim = scan.next().toUpperCase();
        System.out.print("Soyisim giriniz : ");
        String soyIsim = scan.next().toUpperCase();
        System.out.print("Kredi kartı numarası giriniz : ");
        String kk = scan.next();

    }
}