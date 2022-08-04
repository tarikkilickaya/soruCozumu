package Replit;

import java.util.Arrays;

public class ArraydekiIkinciEnBuyukSayi {
    public static void main(String[] args) {
         /*
         Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
         Array: [1232,2345,5467,678,3454,2312,3451]
          */

        int[] dizi = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(dizi);



        int enbuyuk = dizi[0];
        int ikinci = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enbuyuk) {
                ikinci = enbuyuk;
                enbuyuk = dizi[i];
            } else if (dizi[i] > ikinci) {
                ikinci = dizi[i];
            }
        }
        System.out.println(ikinci);
    }
}
