package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S05_sortMethoduyla_AlfabetikSira {
    public static void main(String[] args) {
        // sort() methoduyla alfabetik sıraya diz.
        // Şöyle olmalı : A, B, C, D, L

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("B");
        liste.add(1,"L");

        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste); // [A, B, C, D, L]
    }
}
