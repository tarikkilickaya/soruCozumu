package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S08_clear {
    public static void main(String[] args) {
        // clear() methoduyla list'teki tüm elemanları sil.

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("B");
        liste.add(1,"L");

        liste.clear();
        System.out.println(liste); // []
    }
}
