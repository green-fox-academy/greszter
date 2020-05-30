package product_database_2;

import java.util.*;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> productDatabase2 = new HashMap<>();
        productDatabase2.put("Eggs", 200);
        productDatabase2.put("Milk", 200);
        productDatabase2.put("Fish", 400);
        productDatabase2.put("Apples", 150);
        productDatabase2.put("Bread", 50);
        productDatabase2.put("Chicken", 550);

        System.out.print("Products that cost less than 201 are: ");
        keysUnder(productDatabase2);

        System.out.println();

        System.out.print("Products that cost more than 150 are: ");
        keysOver(productDatabase2);

    }

    public static void keysUnder(HashMap<String, Integer> products){
        Integer value = 201;
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() < value)
            list.add(entry.getKey());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public static void keysOver(HashMap<String, Integer> products){
        Integer value = 150;
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() > value){
                list.add(entry.getKey());
                list.add(entry.getValue().toString());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}

