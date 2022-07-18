package StringManipulation;

import java.util.Scanner;

public class SManipulations_04_Sifre {
    public static void main(String[] args) {

        /*
        Kullanıcıdan şifre alalım. Aşağıdaki şartlar sağlanıyorsa "Şifre başarıyla tanımlandı"
        sağlamıyorsa "İşlem başarısız, lütfen yeni bir şifre giriniz" yazdıralım.

        - İlk harf büyük olmalı
        - Son harf küçük olmalı
        - Şifre boşluk içermemeli
        - Şifre uzunluğu en az 8 karakterli olmalı
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifreyi giriniz");
        String sifre = scan.next();

        boolean ilkHarf = sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z';
        boolean sonHarf = sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1) <= 'z';
        boolean bosluk =  !sifre.contains(" ");
        boolean uzunluk = sifre.length() >= 8;

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("Şifre başarıyla tanımlandı");
        } else {
            System.out.println("İşlem başarısız, lütfen yeni bir şifre giriniz");
        }

    }
}

