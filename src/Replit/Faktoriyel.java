package Replit;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=65432*1=720
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Tam sayı giriniz : ");
        int input = scan.nextInt();
        int sonuc = 1;

        for (int i = input; i >= 1; i--) {
            sonuc *= i;
        }
        System.out.println(input + "! = " + sonuc);
    }
}
