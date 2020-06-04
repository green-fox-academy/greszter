package shopping_list_2;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onipn", 1.10);

        HashMap<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        HashMap<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breatst", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        System.out.println("Bob pays " + addTogether(products, bobsList));

        System.out.println("Alice pays " + addTogether(products, alicesList));

        System.out.print("Who buys more rice?");
        whoBuysMore(bobsList, alicesList, "Rice");

        System.out.print("Who buys more potato?");
        whoBuysMore(bobsList, alicesList, "Potato");
        System.out.println();

        System.out.print("Who buys more different products? ");
        moreProducts(bobsList, alicesList);

        System.out.print("Who buys more products (piece)? ");
        whoBuysMoreItems(bobsList, alicesList);


    }

    public static Double addTogether(HashMap<String, Double> price, HashMap<String, Integer> items){
        double sum = 0;
        for (Map.Entry<String, Double> pricePerItem : price.entrySet()) {
            for (Map.Entry<String, Integer> numberOfItems : items.entrySet()){
                if (pricePerItem.getKey().equals(numberOfItems.getKey()))
                    sum = sum + ((pricePerItem.getValue() * (double) numberOfItems.getValue()));
        }
    }return sum;
    }

    public static void whoBuysMore(HashMap<String, Integer> bobsList, HashMap<String, Integer> alicesList, String item) {


        int bobsNumber = bobsList.containsKey(item)?bobsList.get(item):0;
        int alicesNumber = alicesList.containsKey(item)?alicesList.get(item):0;



                if (bobsNumber > alicesNumber) {
                    System.out.println("Bob");
                }
                if (bobsNumber < alicesNumber) {
                    System.out.println("Alice");
                }
                if (bobsNumber == alicesNumber) {
                    System.out.println("Equal");
                }

    }

        public static void moreProducts (HashMap < String, Integer > bob, HashMap < String, Integer > alice){
            int bobsNumber = bob.size();
            int alicesNumber = alice.size();

            if (bobsNumber > alicesNumber) {
                System.out.println("Bob");
            }
            if (bobsNumber < alicesNumber) {
                System.out.println("Alice");
            } else if (bobsNumber == alicesNumber) {
                System.out.println("Equal");
            }
        }

        public static Integer numberOfAllItems(HashMap<String, Integer> list){
            int sum = 0;
            for (Map.Entry<String, Integer> allItems : list.entrySet()) {
                sum = sum + allItems.getValue();
            }
            return sum;
        }

        public static void whoBuysMoreItems(HashMap<String, Integer> bob, HashMap<String, Integer> alice){
            if (numberOfAllItems(bob) > numberOfAllItems(alice)){
                System.out.println("Bob");
            }if (numberOfAllItems(bob) < numberOfAllItems(alice)){
                System.out.println("Alice");
            }else{
                System.out.println("Equal");
            }
        }
    }
