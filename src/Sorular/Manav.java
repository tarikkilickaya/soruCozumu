package Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
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
    static List<String> urunler = new ArrayList<>();
    static List<Double> fiyat = new ArrayList<>();
    static List<String> sepet = new ArrayList<>();

    public static void main(String[] args) {

        fiyat.add(20.10);
        fiyat.add(30.20);
        fiyat.add(30.50);
        fiyat.add(20.30);
        fiyat.add(30.10);
        fiyat.add(50.20);
        fiyat.add(100.90);
        fiyat.add(60.10);
        fiyat.add(40.30);
        fiyat.add(20.70);
        fiyat.add(10.50);

        urunler.add("00 - Domates");
        urunler.add("01 - Patates");
        urunler.add("02 - Biber");
        urunler.add("03 - Soğan");
        urunler.add("04 - Havuç");
        urunler.add("05 - Elma");
        urunler.add("06 - Muz");
        urunler.add("07 - Çilek");
        urunler.add("08 - Kavun");
        urunler.add("09 - Üzüm");
        urunler.add("10 - Limon");

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println(urunler);
            System.out.print("Ürün kodunu giriniz : ");
            int secilenUrun = scan.nextInt();
            System.out.print("Kaç kg almak istiyorsunuz : ");
            int kilo = scan.nextInt();
            sepet.add(String.valueOf(secilenUrun));
            System.out.println("Devam etmek istiyor musunuz? \n \"Evet\" veya \"Hayır\" şeklinde cevap veriniz");
            String cevap = scan.next();
            if (cevap.equalsIgnoreCase("evet")) {
                continue;
            } else if (cevap.equalsIgnoreCase("hayır")) {
                break;
            } else System.out.println("Geçerli bir cevap giriniz");
        }
    }
}