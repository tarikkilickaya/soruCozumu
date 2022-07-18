package IfElse;

import java.util.Scanner;

public class If08_OyKullanma {
    public static void main(String[] args) {

        /*
        Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lütfen geçerli bir yaş giriniz");
        } else if (yas >= 70) {
            System.out.println("Üç kez oy kullanabilir");
        } else if (yas < 70 && yas >= 50) {
            System.out.println("İki kez oy kullanabilir");
        } else if (yas < 50 && yas >= 18) {
            System.out.println("Bir kez oy kullanabilir");
        }
    }
}


