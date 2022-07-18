package IfElse;

import java.util.Scanner;

public class If02_Dikdortgen {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan dikdörtgenin kenar uzunluklarini isteyin ve dikdörtgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        int kenar4 = scan.nextInt();

        if (kenar1 == kenar2 && kenar3 == kenar4 && kenar4 == kenar1) {
            System.out.println("Bu dörtgen bir karedir.");
        } else {
            System.out.println("Bu dörtgen bir kare değildir.");
        }

        }
    }

