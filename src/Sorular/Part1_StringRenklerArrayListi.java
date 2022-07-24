package Sorular;

import java.util.ArrayList;
import java.util.List;

public class Part1_StringRenklerArrayListi {
    public static void main(String[] args) {
           /* Part1:
           Create an arraylist of Strings
           add - "Red", "Green", "Blue", "Yellow" and "Black" inside
           print out all the elements, each element on new line
           */

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}