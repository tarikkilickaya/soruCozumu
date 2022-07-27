package Sorular;

import java.util.Scanner;

public class soruu {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        char ch1= 'a' ;
        String name ="John came late"
        Expected Output:
        Number of a = 2
        */

        Scanner scan = new Scanner(System.in);
        String cumle = scan.next();
        char ch1 = scan.next().charAt(0);
        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ch1) {
                sayac++;
            }
        }
        System.out.println(sayac + " kez var.");
    }
}