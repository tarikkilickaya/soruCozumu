package DataCasting;

public class DataCasting_02_Narrowing {
    public static void main(String[] args) {

        // int türünde bir değişken oluşturup adım adım narrowing yapalım.

        int sayi1 = 60589;

        System.out.println("Integer değerindeki karşılığı: " + sayi1);

        short sayi2 = (short) sayi1;

        System.out.println("short değerindeki karşılığı: " + sayi2);

        byte sayi3 = (byte) sayi1;

        System.out.println("byte değerindeki karşılığı: " + sayi3);

        char sayi4 = (char) sayi1;

        System.out.println("char değerindeki karşılığı: " + sayi4);







    }
}
