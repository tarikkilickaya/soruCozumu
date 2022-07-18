package IfElse;

import java.util.Scanner;

public class If05_EmekliKadinErkek {
    public static void main(String[] args) {
        /*
        Kadın 60'tan büyükse erkek 65'ten büyükse emekli olabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi ve yaşınızı giriniz");
        String cinsiyet = scan.next().toLowerCase();
        int yas = scan.nextInt();

        if (cinsiyet.equals("erkek") && yas > 65) {
            System.out.println("Emekli olabilirsiniz.");
        }

        }


    }







