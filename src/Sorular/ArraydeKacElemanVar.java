package Sorular;

public class ArraydeKacElemanVar {
    public static void main(String[] args) {

        /*
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        verilen Array icinde
        --> kac tane eleman oldugunu return eden methodu yazdiriniz
        cevap : 13 donsun
        */

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        kacElemanVar(arr);

        System.out.println(kacElemanVar(arr));
    }

    public static int kacElemanVar(int[][] arr) {

        int sayac = 0;

        for (int[] each : arr) {
            for (int each2 : each) {
                sayac++;
            }
        }
        return sayac;
    }
}