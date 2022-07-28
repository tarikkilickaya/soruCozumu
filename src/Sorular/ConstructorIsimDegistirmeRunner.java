package Sorular;

import java.util.Scanner;

public class ConstructorIsimDegistirmeRunner {


    public static void main(String[] args) {

        String isim = "Ali";
        String soyIsim = "İyi";
        String no = "1453";
        int yas = 22;

        ConstructorIsimDegistirme ogrenci = new ConstructorIsimDegistirme(isim, soyIsim, no, yas);

        isimDegistir(isim, soyIsim, no, yas);
        System.out.println("Öğrenci bilgileri : "+ isim + " " + soyIsim + " " + no + " " + yas);
        soyIsimDegistir(soyIsim);
    }

    public static void isimDegistir(String isim, String soyIsim, String no, int yas) {

        isim = "Veli";
        soyIsim = "Kötü";
        no = "1789";
        yas = 30;

        System.out.println(isim + " " + soyIsim + " " + no + " " + yas);
    }

    private static void soyIsimDegistir(String soyIsim) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni soyismi gir : ");
        String yeniSoyIsim = scan.next();
        soyIsim = yeniSoyIsim;
    }
}