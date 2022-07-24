package Sorular;

import java.util.Arrays;
import java.util.List;

public class KarakterKacKezTekrarlandi {
    public static void main(String[] args) {
        /*
        Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
        char ch= 'e' ;
        String name ="Sevecen"
        => Tekrar Sayisi = 3
         */

        String name = "Sevecen";
        String  ch = "e";
        int sayac = 0;
        String [] arr = name.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(ch)){
                sayac++;
            }
        }
        System.out.println("Tekrar sayısı = " + sayac);
    }
}