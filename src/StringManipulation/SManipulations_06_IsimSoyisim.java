package StringManipulation;

import java.util.Scanner;

public class SManipulations_06_IsimSoyisim {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soytIsim = scan.next();

        String tamIsim = isim.toUpperCase();

        System.out.println("Tam isminiz : " + tamIsim);
    }
}
