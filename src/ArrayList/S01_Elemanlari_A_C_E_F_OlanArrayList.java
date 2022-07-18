package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S01_Elemanlari_A_C_E_F_OlanArrayList {
    public static void main(String[] args) {

        // Elemanlar A, C, E ve F olan bir String ArrayList oluşturup ekrana yazdırınız.

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("E");
        liste.add("F");

        System.out.println(liste); // [A, C, E, F]
    }
}