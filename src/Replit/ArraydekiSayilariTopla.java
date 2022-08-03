package Replit;

public class ArraydekiSayilariTopla {
    /*
    Array deki sayıları tolpayan Java kodunu yazınız.
    array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Array toplamı: 55
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam = 0;
        for (int each : arr) {
            toplam += each;
        }
        System.out.println("Array toplamı : " + toplam);
    }
}
