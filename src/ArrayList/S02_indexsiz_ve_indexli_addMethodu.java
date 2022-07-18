package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S02_indexsiz_ve_indexli_addMethodu {
    public static void main(String[] args) {
        /*
        indexsiz add() methoduyla B'yi ekle
        indexli add() methoduyla L'yi 1 numaralı indexe ekle.
        Listeyi yazdır. Şöyle olmalı: A, L, C, E, F, B
         */

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("E");
        liste.add("F");
        liste.add("B");
        liste.add(1,"L");
        System.out.println(liste); // [A, L, C, E, F, B]
    }
}