package Sorular;

public class PalindromeString {
    public static void main(String[] args) {
        /*
         Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
         polindrome :tersten okunuşu da aynı olan ifadeierdir.
         ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

        String str = "Ey edip adanada pide ye";

        palindromeMu(str);
    }

    public static void palindromeMu(String str) {

        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        if (temp.equals(str)) {
            System.out.println("palindrome");
        } else System.out.println("palindrome değil");
    }
}