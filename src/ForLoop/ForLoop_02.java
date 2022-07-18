package ForLoop;

import java.util.Scanner;

public class ForLoop_02 {
    public static void main(String[] args) {
        /*
        100’den kucuk bir tamsayi isteyin.
        1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
        Ancak; - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 100'den küçük bir sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            System.out.print(i + " ");

            if (!(i % 3 == 0 || i % 5 == 0)) {
                System.out.println(i + " ");
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            } else if (i % 3 == 0 ) {
                System.out.println("Java");
            } else if (i % 5 == 0) {
                System.out.println("Güzeldir");
            }
        }
    }
}

