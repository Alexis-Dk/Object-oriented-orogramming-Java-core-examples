package by.bntu.fitr.povt.immutable.case4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Alexey Druzik on 04.11.2020
 * Pay attention at the describing List.of()-method - https://docs.oracle.com/javase/9/docs/api/java/util/List.html
 * Pay attention at the describing List.of()-method - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * https://habr.com/ru/company/piter/blog/470149/ (orig - https://nipafx.dev/immutable-collections-in-java#)
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "values");
        list.add("Some value");
        System.out.println(list);

        /*
            Arrays.asList returns a unmodifiable list, but you can't add or remove an element(not be structurally modified)
         */
        List<String> list2 = Arrays.asList("1", "2");
        list2.add("3");
        for (String s: list2) {
            System.out.println(s);
        }

        /*
            If you really want to make a mutable list immutable, please try using Collections.unmodifiableList(mutableList);
         */
        List<String> list4 = new ArrayList<>();
        list4.add("4");
        List<String> list5 = Collections.unmodifiableList(list4);
        for (String s: list5) {
            System.out.println(s);
        }
    }
}
