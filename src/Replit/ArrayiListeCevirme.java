package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayiListeCevirme {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]
         */

        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
