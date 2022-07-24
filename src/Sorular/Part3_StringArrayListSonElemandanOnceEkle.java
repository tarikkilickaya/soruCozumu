package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part3_StringArrayListSonElemandanOnceEkle {
    public static void main(String[] args) {

        /*
        Part3:
        Create a method that accepts a String arraylist and a String as parameters
        it should add element before last element
        ex:  [1, 2, 3]  -> [1, 2, 4, 3]
        */

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String str = "4";

        System.out.println("sonElemandanOnceEkle methodundan önce : " + list);

        sonElemandanOnceEkle(list, str);
    }

    public static void sonElemandanOnceEkle(List<String> list, String str) {

        list.add(3,str);
        System.out.println("sonElemandanOnceEkle methodundan sonra : " + list);
    }
}