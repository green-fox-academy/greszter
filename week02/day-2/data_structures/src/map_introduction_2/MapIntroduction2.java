package map_introduction_2;

import java.util.*;
import java.util.Map.Entry;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> bookTitles = new HashMap<>();
        bookTitles.put("978-1-60309-452-8", "A Letter to Jo");
        bookTitles.put("978-1-60309-459-7", "Lupus");
        bookTitles.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        bookTitles.put("978-1-60309-461-0", "The Lab");

        System.out.println(bookTitles);

        for (Map.Entry<String, String> entry : bookTitles.entrySet()){
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }

        //Set<String> keys = bookTitles.keySet();
        //for(String key:keys) {
        //   System.out.println(bookTitles.get(key) + " (ISBN: " + key + ")");
        //}

        bookTitles.remove("978-1-60309-444-3");

        bookTitles.values().remove("The Lab");

        System.out.println(bookTitles);

        bookTitles.put("978-1-60309-450-4", "They Called Us Enemy");
        bookTitles.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(bookTitles.containsKey("478-0-61159-424-8"));

        System.out.println(bookTitles.get("978-1-60309-453-5"));







    }
}
