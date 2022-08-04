package Replit;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArraydekiTekCiftSayilar {
    public static void main(String[] args) {
        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        Array: [1,2,3,4,5,6,7,8,9]
        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> tekSayilar = new ArrayList<>();
        List<Integer> ciftSayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ciftSayilar.add(arr[i]);
            } else if (arr[i] % 2 != 0) {
                tekSayilar.add(arr[i]);
            }
        }
        System.out.println("Tek sayılar : " + tekSayilar.size());
        System.out.println("Çift sayılar : " + ciftSayilar.size());
    }
}