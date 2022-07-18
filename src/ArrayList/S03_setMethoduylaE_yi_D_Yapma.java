package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S03_setMethoduylaE_yi_D_Yapma {
    public static void main(String[] args) {

        // set methoduyla E'yi D yap.
        // Şöyle olmalı : A, L, C, D, F, B

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("E");
        liste.add("F");
        liste.add("B");
        liste.add(1,"L");
        System.out.println(liste);

        int indeks = liste.indexOf("E");
        liste.set(indeks, "D");
        System.out.println(liste); // [A, L, C, D, F, B]
    }
}
