package ArrayList;

public class S11_String_ForEachLoop {
    public static void main(String[] args) {
        /*
        Bir String oluşturunuz ve bu String'deki karakterleri for each loop kullanarak yazdırınız.
        ipucu: split()
         */

        String str = "Merhaba dünya, Merhaba Java!";

        String[] dizi = str.split("");

        for (String elemanlar:dizi){
            System.out.print(elemanlar + "  "); // M  e  r  h  a  b  a     d  ü  n  y  a  ,     M  e  r  h  a  b  a     J  a  v  a  !
        }
    }
}