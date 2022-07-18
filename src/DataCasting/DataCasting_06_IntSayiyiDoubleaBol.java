package DataCasting;

public class DataCasting_06_IntSayiyiDoubleaBol {
    public static void main(String[] args) {

        // int bir sayıyı double bir sayıya böldrüelim.

        int sayi1 = 468;
        double sayi2 = 2256.826;

        System.out.println(sayi1/sayi2); // double int'e göre daha kapsamlı olduğu için sonucu da double türünde verdi.

        int sayi3 = 70;
        double sayi4 = (double) sayi3;

        System.out.println(sayi3/sayi4);
    }
}
