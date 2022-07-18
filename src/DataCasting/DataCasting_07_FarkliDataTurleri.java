package DataCasting;

public class DataCasting_07_FarkliDataTurleri {
    public static void main(String[] args) {

        int sayi1 = 594;
        double sayi2 = 87.5634;
        String kelime = "kapı";
        char karakter = '%';

        kelime = kelime + karakter;

        System.out.println(kelime); // ikisini birleştirdi.

        karakter = (char) sayi1;

        System.out.println(karakter); // ASCII değerini verdi.

        sayi2 = sayi1++;

        System.out.println(sayi2); // int değeri double formunda yazdı.




    }
}
