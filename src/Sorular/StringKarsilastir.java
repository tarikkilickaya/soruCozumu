package Sorular;

public class StringKarsilastir {
    public static void main(String[] args) {

        /*
        Girilen iki String veriyi karşılaştıran Java kodu yazınız.

        Test data:
        1. String : techproed.com
        2. String : Techproed.com

        Beklenen Çıktı:
        False

        Test data:
        1. String : techproed.com
        2. String : techproed.com

        Beklenen Çıktı:
        true
         */

        String input1 = "techproed.com";
        String input2 = "techproed.com";

        boolean sonuc = input1.equals(input2);

        System.out.println(sonuc);
    }
}