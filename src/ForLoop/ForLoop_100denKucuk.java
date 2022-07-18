package ForLoop;

import java.util.Scanner;

public class ForLoop_100denKucuk {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 100'den küçük bir tam sayı isteyip 1'den başlayarak girilen sayıya kadar
        3'ün katı olan sayıları yazdıralım.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 100'den küçük bir sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
