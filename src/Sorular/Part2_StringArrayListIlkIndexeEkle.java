package Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part2_StringArrayListIlkIndexeEkle {
    public static void main(String[] args) {

        /*
        Part2:
        Create a method that accepts a String arraylist and a String as parameters
        method should add the element at the first index of arraylist
         */


        List<String> list = new ArrayList<>();
        list.add("bu");
        list.add("bir");
        list.add("String");
        list.add("Arraylisttir");

        String str = "doğru okudun";

        System.out.println("ilkIndexeEkle methodundan önce ArrayList : " + list);

        ilkIndexeEkle(list,str);
    }

    public static void ilkIndexeEkle(List<String> list, String str) {

        list.add(0,str);
        System.out.println("ilkIndexeEkle methodundan sonra Arraylist : " + list);
    }
}