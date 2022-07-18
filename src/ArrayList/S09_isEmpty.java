package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S09_isEmpty {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("B");
        liste.add(1,"L");

        liste.clear();
        System.out.println(liste); // []

        System.out.println(liste.isEmpty()); // true
    }
}