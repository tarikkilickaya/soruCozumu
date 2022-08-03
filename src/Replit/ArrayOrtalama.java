package Replit;

public class ArrayOrtalama {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        Array = [20, 30, 25, 35, -16, 60, -100 ]
        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
         */

        int[] arr = {20, 30, 25, 35, -16, 60, -100};
        double toplam = 0;
        double ortalama = 0;

        for (int each : arr) {
            toplam += each;
        }
        ortalama = toplam / arr.length;
        System.out.println("Array sayılarının ortalaması : " + (ortalama));
    }
}