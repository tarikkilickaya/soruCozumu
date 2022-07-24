package Sorular;

public class Palindrome {
    public static void main(String[] args) {

        /*
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru
        okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
        Test Data:
        madam
        Beklenen Çıktı:
        True
         */

        String str = "madam";
        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        if (temp.equals(str)) {
            System.out.println("palindrome");
        } else System.out.println("palindrome değil");
    }
}