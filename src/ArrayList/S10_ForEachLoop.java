package ArrayList;

public class S10_ForEachLoop {
    public static void main(String[] args) {
            /*
            Bir int array oluştur ve bu arraydeki tüm sayıların çarpımını
            for each loop kulanarak bul.
            Sonucu ekrana yazdır.
            */

        int[] array = {7, 4, 3, 2, 9};
        int sonuc = 1;

        for (int eleman : array) {
            sonuc *= eleman;
        }
        System.out.println(sonuc);
    }
}