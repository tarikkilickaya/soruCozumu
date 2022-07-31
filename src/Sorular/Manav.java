package Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Manav {

    static List<String> urunler = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int urunNo;
    static double urunMiktari;
    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKilo = new ArrayList<>();
    static List<Double> sepetFiyat = new ArrayList<>();
    static double toplamFiyat;


    /* Basarili Market-manav alış-veriş programı.
     * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
     *         No        Ürün         Fiyat
             ====     =======      =========
             00  Domates           20.10  TL
             01  Patates           30.20  TL
             02  Biber             30.50  TL
             03  Soğan             20.30  TL
             04  Havuç             30.10  TL
             05  Elma              50.20  TL
             06  Muz               100.90 TL
             07  Çilek             60.10  TL
             08  Kavun             40.30  TL
             09  Üzüm              20.70  TL
             10  Limon             10.50  TL
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini
     * isteyiniz.
     * 3. Adım: Kaç kg satın almak istediğini ve urun kodunu  aliniz.
     * 4. Adım: Alınacak bu ürünü sepete ekleyiniz
     * 5. Sepeti yazdırınız.
     * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
     * yönlendiriniz.
     * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz.
     */

    public static void main(String[] args) {

        urunFiyatlari.add(20.10);
        urunFiyatlari.add(30.20);
        urunFiyatlari.add(30.50);
        urunFiyatlari.add(20.30);
        urunFiyatlari.add(30.10);
        urunFiyatlari.add(50.20);
        urunFiyatlari.add(100.90);
        urunFiyatlari.add(60.10);
        urunFiyatlari.add(40.30);
        urunFiyatlari.add(20.70);
        urunFiyatlari.add(10.50);

        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Sogan");
        urunler.add("Havuc");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Cilek");
        urunler.add("Kavun");
        urunler.add("Uzum");
        urunler.add("Limon");

        urunleriListele();

        sepeteEkle(urunNo,urunMiktari);

        do {
            System.out.print("Hangi ürünü istiyorsunuz : ");
            urunNo = scan.nextInt();
            System.out.print("Ne kadar : ");
            urunMiktari = scan.nextDouble();
            toplamFiyat += urunMiktari * urunFiyatlari.get(urunNo);
            System.out.print("Devam etmek istiyor musunuz : ");
            String cevap = scan.next();
            if (cevap.equalsIgnoreCase("e")) {
                continue;
            } else if (cevap.equalsIgnoreCase("h")) {
                System.out.println("Ödeme ekranına geçiliyor");
                break;
            }
        } while (true);

        odeme(sepetFiyat);
    }

    public static void odeme(List<Double> sepetFiyat) {
        System.out.println("Toplam tutar : " + sepetFiyat + "\nÖdemeyi nasıl yapmak istersiniz? \nCoin/Nakit/Kart/Veresiye");
        String odemeSekli = scan.next();
        if (odemeSekli.equalsIgnoreCase("coin")) {
            System.out.println("Coin ile ödemeniz alındı");
        } else if (odemeSekli.equalsIgnoreCase("nakit")) {
            System.out.println("Nakit ödemeniz alındı");
        } else if (odemeSekli.equalsIgnoreCase("veresiye")) {
            System.out.println("Borcunuz versiye defterine eklendi");
        } else System.out.println("Lütfen geçerli bir ödeme yöntemi seçiniz");
    }


    public static void sepeteEkle(int urunNo, double urunMiktari) {
        sepetUrunler.add(String.valueOf(urunNo));
        sepetUrunler.add(String.valueOf(urunMiktari));
    }

    public static void urunleriListele() {
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(i + "\t" + urunler.get(i) + "\t" + Manav.urunFiyatlari.get(i));
        }
    }
}