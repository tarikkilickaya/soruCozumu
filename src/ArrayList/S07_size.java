package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S07_size {
    public static void main(String[] args) {
        // size() methoduyla list'in kaç elemanlı olduğunu ekrana yazdır.

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("B");
        liste.add(1,"L");

        System.out.println(liste.size()); // 5

    }
}