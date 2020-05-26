package list_introduction_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList<>();

        ListB.addAll(ListA);

        System.out.println(ListB);

        ListB.remove("Durian");

        System.out.println(ListB);

        System.out.println(ListA);

        ListA.add(4, "Kiwifruit");

        System.out.println(ListA);

        System.out.println(ListA.equals(ListB));

        System.out.println(ListA.indexOf("Avocado"));

        System.out.println(ListB.indexOf("Durian"));

        Collections.addAll(ListB,"Passion Fruit", "Pomelo");

        System.out.println(ListB);

        System.out.println(ListA.get(2));


    }
}
