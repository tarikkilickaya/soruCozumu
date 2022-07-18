package WhileLoop;

import java.util.Scanner;

public class WhileLoop_TekSayilariTopla {
    public static void main(String[] args) {
        /*
        Negatif değer girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden tek sayıları toplayan bir program yaz
         */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;


        while (true) {
            System.out.print("Lütfen sayı giriniz : ");
            int sayi = scan.nextInt();

            if (sayi < 0) {
                System.out.println("Tek sayılar toplamı : " + toplam);
                break;
            }
            if (sayi % 2 != 0) {
                toplam += sayi;
            }
        }
    }
}
