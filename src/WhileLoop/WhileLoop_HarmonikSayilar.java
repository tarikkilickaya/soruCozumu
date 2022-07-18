package WhileLoop;

import java.util.Scanner;

public class WhileLoop_HarmonikSayilar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        double h = scan.nextDouble();
        double harmonic = 0.0;

        while (h > 0) {
            harmonic = harmonic + (1 / h);
            h--;
        }
        System.out.println(harmonic);
    }
}
