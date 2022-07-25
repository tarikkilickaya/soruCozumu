package Sorular;

public class Armstrong02_HangisiArmstrong {
    public static void main(String[] args) {
        /*
        soru2: Birden baslayarak girilen sayıya kadar her bir tam sayının armstrong sayı olup olmadıgını
        gösteren program yazınız
       */

        /*
        NOT : Bir sayının basamaklarındaki tüm rakamlarının sayı değerlerinin,
        sayının basamak sayısı kadar kuvveti alınıp toplanıldığında elde edilen sayı,
        sayının kendisine eşitse bu sayıya “Armstrong sayısı” denir.
         */


        int baslangic = 1;
        int bitis = 78;


        int result = 1;
        int yuzler = baslangic % 10;


        for (int i = baslangic; i < bitis; i++) {
            result += baslangic;

        }

    }
}