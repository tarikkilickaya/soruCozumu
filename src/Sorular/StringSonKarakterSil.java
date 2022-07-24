package Sorular;



public class StringSonKarakterSil {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.
        Test Data:
        good
        Beklenen Çıktı:
        goo
         */

        String input = "good";

        String output = input.substring(0,input.length()-1);
        System.out.println(output);

    }
}