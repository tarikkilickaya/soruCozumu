package Replit;

public class AlfabeyiYazdir {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.
        OUTPUT :
        a b c .. .. .. .. y z
         */

        char harf = 'a';
        while (harf <= 'z') {
            System.out.print(harf + " ");
            harf++;
        }
        System.out.println();
        char buyyukHarf = 'A';
        while (buyyukHarf <= 'Z') {
            System.out.print(buyyukHarf + " ");
            buyyukHarf++;
        }
    }
}