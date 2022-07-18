package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S04_remove_ile_F_yi_Silme {
    public static void main(String[] args) {
        // remove() methoduyla F'yi sil.
        // Şöyle olmalı : A, L, C, F, B

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("F");
        liste.add("B");
        liste.add(1,"L");

        System.out.println(liste);

        liste.remove(4);
        System.out.println(liste); // [A, L, C, F, B]
    }
}
