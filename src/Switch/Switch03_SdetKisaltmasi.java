package Switch;

import java.util.Scanner;

public class Switch03_SdetKisaltmasi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan SDET kısaltmasındaki harflerden birini girmesini isteyelim
        S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse "In Testing" yazdıralım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen SDET kısaltmasındaki harflerden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S' :
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
        }
    }
}
