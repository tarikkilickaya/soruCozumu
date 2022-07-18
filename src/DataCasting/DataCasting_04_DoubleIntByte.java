package DataCasting;

public class DataCasting_04_DoubleIntByte {
    public static void main(String[] args) {

        // double 255.36 sayısını int'a sonra o int'ı byte'a çevirip yazdıralım.

        double sayi1 = 255.36;

        int sayi2 = (int) sayi1;

        System.out.println(sayi2); // 255 yazdırdı çünkü int tam sayı kısımlarını tutar, ondalıklı kısımları siler.

        byte sayi3 = (byte) sayi2;

        System.out.println(sayi3); // -1 yazdırdı çünkü byte'ın sınır değerleri arasında döngü gerçekleşti.

    }
}
