package Sorular;

public class YayinYiliRunner {
    public static void main(String[] args) {

        BookClass bc = new BookClass();
        System.out.println(bc.toString());

        BookClass bc1 = new BookClass("Yeter ki İste",
                "Deepak Chopra", 2019);

        yazdir(bc1);
    }

    private static void yazdir(BookClass bc1) {

        BookClass bc2 = new BookClass("Saftirik",2019);

        System.out.println(bc2);
    }
}