package telephone_book;

import java.util.HashMap;
import java.util.Map;

public class TelehoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println("John K. Miller's phone number: " + phoneBook.get("John K. Miller"));

        for (Map.Entry<String, String> entry : phoneBook.entrySet()){
            if (entry.getValue() == "307-687-2982"){
                System.out.println("The 307-687-2982 number is " + entry.getKey());
            }
        }

        System.out.println("Do we know Chris E. Myers' phone number?");
        if (phoneBook.containsKey("Chris E. Myers")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

