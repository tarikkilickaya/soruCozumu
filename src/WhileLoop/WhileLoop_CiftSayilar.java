package WhileLoop;

import java.util.Scanner;

public class WhileLoop_CiftSayilar {
    public static void main(String[] args) {
        //  Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş değerlerini giriniz");
        int bas = scan.nextInt();
        int bit = scan.nextInt();

        System.out.print("Girilen " + bas + " değeri ile " + bit + " değeri arasındaki çift sayılar : ");
        while (bas <= bit){
            if (bas % 2 ==0){
                System.out.print(bas + " ");
            }
            bas++;
        }
    }
}
