package WhileLoop;

import java.util.Scanner;

public class WhileLoop_Faktoriyel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int f = scan.nextInt();
        int sonuc = 1;

        while (f > 0) {
            sonuc *= f;
            f--;
        }
        System.out.println("Girilen sayının faktoriyeli : " + sonuc);
    }
}
