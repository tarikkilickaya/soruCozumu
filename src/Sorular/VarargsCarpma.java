package Sorular;

public class VarargsCarpma {
    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)

        System.out.println("Verilen sayıların çarpımı = " + carpma(5,7));
    }

    public static int carpma(int... sayilar) {
        int toplam = 1;
        for (int i = 0; i < sayilar.length; i++) {
            toplam *= sayilar[i];
        }
        return toplam;
    }
}