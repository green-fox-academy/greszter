package shopping_list;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList, "eggs", "milk", "fish", "apples", "bread", "chicken");

        System.out.println("Do we have milk on the list?");
        if (shoppingList.contains("milk")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        System.out.println("Do we have bananas on the list?");
        if (shoppingList.contains("bananas")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
