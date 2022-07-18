package StringManipulation;

import java.util.Scanner;

public class SManipulations_02_IsimSoyisim {
    public static void main(String[] args) {

        /*
        Kullanıcıdan isim alalım.
        İsim "a" içeriyorsa "İsim a içeriyor"
        İsim "Z" içeriyorsa "İsim Z içeriyor"
        İkisi de yoksa "İsim a veya Z içermiyor" yazdıralım.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();


        if (isim.contains("a")) {
            System.out.println("İsim \"a\" içeriyor");
        } else if (isim.contains("Z")){
            System.out.println("İsim \"Z\" içeriyor");
        } else System.out.println("İsim \"a\" veya \"Z\" içermiyor");
    }
}
