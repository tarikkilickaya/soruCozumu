package DataCasting;

public class DataCasting_05_IkiIntSayiyiBirbirineBol {
    public static void main(String[] args) {

        // int iki sayıyı birbirine böldürelim.

        int sayi1 = 25;
        int sayi2 = 2;

        System.out.println(sayi1/sayi2); // 12.5 çıkması gerekirken ondalıklı kısmı attı ve tam sayı olarak 12 verdi.

        System.out.println(sayi2/sayi1); // 2/25 işleminin sonucu 0.08 olmasına rağmen yine ondalıklı kısmı sildiği için 0 verdi.

    }
}
