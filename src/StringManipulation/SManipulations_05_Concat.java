package StringManipulation;

import java.util.Scanner;

public class SManipulations_05_Concat {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String ifade = scan.next();
        String ifade2 = scan.next();
        String sonuc = ifade.concat(ifade2);

        System.out.println("Concat methoduyla birleştirilen değerler : " + sonuc);

        ifade = ifade.replace(ifade.substring(0 ,1) , "");
        ifade2 = ifade2.replace(ifade2.substring(0 ,1) , "");

        String sonuc2 = ifade+ifade2;

        System.out.println("İlk harfleri atılıp birleştirilen değerler : " + sonuc2);
    }
}
