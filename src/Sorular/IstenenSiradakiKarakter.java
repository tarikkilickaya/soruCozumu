package Sorular;

public class IstenenSiradakiKarakter {
    public static void main(String[] args) {
        /*
        Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

        Test Data:
        Java is fun

        Beklenen Çıktı
        0. pozisyondaki karakter : J

        5. pozisyondaki karakter : i
         */

        String str = "Java is fun";

        String sifirinci = str.substring(0,1);

        System.out.println("0. poziyondaki karakter : " + sifirinci);

        String besinci = str.substring(5,6);

        System.out.println("5. poziyondaki karakter : " + besinci);

    }
}