package Ternary;

import java.util.Scanner;

public class Ternary06_VucutKitleIndeksi {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        BMI 18,5'in altındaysa zayıfsınız
        BMI 18,5 ile 25 arasında ise kilonuz idealdir
        BMI 25-30 arasındaysa şişmansınız
        BMI 30'dan büyük veya eşitse, obez
        Input:
        Agirlik : 71
        Boy : 1,72
        Output:
        BMI : 23.99945916711736 Zayifsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        int kilo = scan.nextInt();
        System.out.print("Boyunuzu giriniz : ");
        double boy = scan.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println((bmi < 18.5) ? ("BMI : " + bmi + " Zayıfsınız.") : (bmi >= 18.5 && bmi < 25) ? ("BMI : " + bmi + " Kilonuz idealdir") :
                (bmi >= 25 && bmi < 30) ? ("BMI : " + bmi + " Şişmansınız") : ("BMI : " + bmi + " Obez"));
    }
}