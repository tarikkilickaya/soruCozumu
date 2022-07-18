package StringManipulation;

public class SManipulations_01 {
    public static void main(String[] args) {

        /*
        String mehodlarını kullanarak " Java ogrenmek123 Cok @guzel " cümlesini
        "Java öğrenmek çok güzel." haline getirelim
         */

        String str = " Java ogrenmek123 Cok @guzel ";

        str = str.trim();

        str = str.replaceAll("\\d" , "");

        str = str.replaceAll("\\W" , "");





    }
}
