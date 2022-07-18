package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S06_contains {
    public static void main(String[] args) {
        // contains() methoduyla L'nin olduğunu M'nin olmadığını doğrula.

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("C");
        liste.add("D");
        liste.add("B");
        liste.add(1,"L");

        System.out.println(liste.contains("L") + " " + liste.contains("M"));
    }
}