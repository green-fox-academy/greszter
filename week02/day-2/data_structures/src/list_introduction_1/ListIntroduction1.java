package list_introduction_1;

import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());

        names.add("William");
        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());

        System.out.println(names.get(2));

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for (int j = 0; j < names.size(); j++){
            System.out.println((j + 1) + ". " + names.get(j));
        }

        names.remove(1);

        Collections.reverse(names);

        for (int k = 0; k < names.size(); k++){
            System.out.println(names.get(k));
        }

        names.removeAll(names);

        System.out.println(names.isEmpty());







    }
}
