package DataCasting;

public class DataCasting_01_Widening {
    public static void main(String[] args) {

        // byte bir değişken oluşturup short, int, float, ve double değişkenlerine adım adım widening yapalım.

        byte sayi1 = 10;
        System.out.println(sayi1);

        short sayi2 = sayi1;

        System.out.println(sayi2);

        int sayi3 = sayi1;

        System.out.println(sayi3);

        float sayi4 = sayi1;

        System.out.println(sayi4);

        double sayi5 = sayi1;

        System.out.println(sayi5);



    }
}
