package ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S12_Q_ya_BasincayaKadar {
    public static void main(String[] args) {
        /*
        Kullanıcı Q'ya basıncaya kadar gireceği isimleri alarak bir liste oluşturup
        bu isimleri bir list olarak döndüren bir method yaz.
         */

        List<String> liste = new ArrayList<>();
        listDondur(liste);
    }

    public static ArrayList listDondur(List<String> liste) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("isim giriniz");
            String str = scan.next();
            if (str.equalsIgnoreCase("q")) {
                break;
            } else {
                liste.add(str);
            }
        }
        System.out.println(liste);
        return (ArrayList) liste;
    }
}