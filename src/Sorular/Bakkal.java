package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bakkal {
    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.

     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazanc…
     */


    static ArrayList<String> gunler = new ArrayList<>();
    static String[] gunlerArray = {"Pzt", "Sal", "Çarş", "Perş", "Cum", "Ctesi", "Paz"};
    static ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
    static int toplam = 0;
    static int ortalama = 0;
    static ArrayList<String> ortUstu = new ArrayList<>();
    static int ortAlti = 0;
    static int gunlukKazanc;

    public static void main(String[] args) {

        gunler.addAll(Arrays.asList(gunlerArray));

        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        while (sayac < 7) {
            System.out.print(gunler.get(sayac) + " günü elde edilen kazancı gir : ");
            gunlukKazanc = scan.nextInt();
            gunlukKazanclar.add(sayac, gunlukKazanc);
            sayac++;
        }
        System.out.println(" ");

        for (int i = 0; i < gunler.size(); i++) {
            System.out.println(gunler.get(i) + " günkü kazanç : " + gunlukKazanclar.get(i));
        }
        System.out.println("");
        System.out.println("Ortalama : " + getOrtalamaKazanc(gunlukKazanclar, ortalama));

        getOrtalamaninUstundeKazanc(gunlukKazanclar, ortalama, ortUstu);
    }

    public static void getOrtalamaninUstundeKazanc(ArrayList<Integer> gunlukKazanclar, int ortalama, ArrayList<String> ortUstu) {

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalama) {
                ortUstu.add(gunler.get(i));
            }
            System.out.println("Ortalama üstü olanlar : " + ortUstu);
        }
    }

    public static int getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar, int ortalama) {

        for (int each : gunlukKazanclar) {
            toplam += each;
        }
        ortalama = toplam / gunler.size();
        return ortalama;
    }
}