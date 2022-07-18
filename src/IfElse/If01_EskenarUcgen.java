package IfElse;

import java.util.Scanner;

public class If01_EskenarUcgen {
    public static void main(String[] args) {

        /*
        Kullanicidan bir üçgenin uc kenar uzunluğunu alin
        eğer uc kenar uzunluğu birbirine eşit ise ekrana "Eşkenar ucgen" yazdirin.
        Diğer durumlarda ekrana "Eşkenar değil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Bu bir eşkenar üçgendir.");
        } else {
            System.out.println("Bu bir eşkenar üçgen değildir.");
        }
    }
}
