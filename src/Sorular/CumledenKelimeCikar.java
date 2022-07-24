package Sorular;

public class CumledenKelimeCikar {
    public static void main(String[] args) {
        /*
            parametre olarak alan bir metot tanımlayınız.
            2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
            3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
            Örneğin;
            ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
            ("merhaba dünya", "dünya") ➞ "merhaba"
        */

        String cumle =  "bugün hava çok güzel";
        String silAra = "çok";
        if (cumle.contains(silAra)) {
            System.out.println("Yazinin cikarilmis hali :" + kelimeSil(cumle, silAra));
        } else {
            System.out.println("Silinmek istene kelime yazida yok");
        }
    }

    public static String kelimeSil(String cumle, String silAra) {
        int baslangic = cumle.indexOf(silAra);
        int uzunluk = silAra.length();
        String sonHali = cumle.substring(0, baslangic) + cumle.substring(baslangic + uzunluk);
        return sonHali;
    }
}