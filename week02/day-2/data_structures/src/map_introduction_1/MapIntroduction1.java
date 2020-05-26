package map_introduction_1;

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> newmap = new HashMap<>();

        System.out.println(newmap.isEmpty());

        newmap.put(97, "a");
        newmap.put(98, "b");
        newmap.put(99, "c");
        newmap.put(65, "A");
        newmap.put(66, "B");
        newmap.put(67, "C");

        System.out.println(newmap.keySet());

        System.out.println(newmap.values());

        newmap.put(68, "D");

        System.out.println(newmap.size());

        System.out.println(newmap.get(99));

        newmap.remove(97);

        System.out.println(newmap);

        System.out.println(newmap.containsValue(100));

        newmap.clear();
        System.out.println(newmap.isEmpty());



    }
}

