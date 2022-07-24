package Sorular;

public class StringiTersCevir {
    public static void main(String[] args) {
        /*
        Stringi ters cevirmek icin bir Java Programi yazin
        1.Yol: StringBuilder () kullanarak
        2.Yol: String Classini kullanarak
        3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        */

        StringBuilder str = new StringBuilder("Bunu terse çevir");
        str.reverse();
        System.out.println("StringBuilder ile : " + str); // riveç esret unuB

        System.out.println(" ");

        String str2 = "Bunu da terse çevirsene";
        String str2Tersi = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            str2Tersi += str2.charAt(i);
        }
        System.out.println("String Class ile : " + str2Tersi); // enesriveç esret ad unuB

        System.out.println(" ");

        String str3 = "Elin değmişken şunu da çeviriver";
        terseCevir(str3);
    }
    public static void terseCevir(String str3) {
        String str3Tersi = "";
        for (int i = str3.length() - 1; i >= 0; i--) {
            str3Tersi += str3.charAt(i);
        }
        System.out.println("terseCevir methodu ile : " + str3Tersi); // reviriveç ad unuş nekşimğed nilE
    }
}