package product_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> productDatabase = new HashMap<>();
        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        System.out.println("The fish is: " + productDatabase.get("Fish"));

        System.out.println("The most expensive product is: " + mostExpensive(productDatabase));

        System.out.println("The average price is: " + (averagePrice(productDatabase) / productDatabase.size()));

        System.out.println("Number of products below 300: " + below300(productDatabase));

        System.out.print("Anything for exactly 125? ");
        anythingFor125(productDatabase);

        System.out.print("The cheapest product is: " + cheapest(productDatabase));



    }

    public static Integer mostExpensive(HashMap<String, Integer> products) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item : products.entrySet()) {
            list.add(item.getValue());
        }
        Integer expensive = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > expensive) {
                expensive = list.get(i);
            }
        }return expensive;
    }

    public static Integer averagePrice(HashMap<String, Integer> products){
        Integer sum = 0;
        for (Map.Entry<String, Integer> item : products.entrySet()) {
            sum = sum + item.getValue();
        }
        return sum;
    }

    public static Integer below300(HashMap<String, Integer> products){
        Integer number = 0;
        for (Map.Entry<String, Integer> item : products.entrySet()){
            if (item.getValue() < 300){
                number = number + 1;
            }
        }return number;
    }

    public static void anythingFor125(HashMap<String, Integer> products){
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item : products.entrySet()){
            list.add(item.getValue());
        }
        String answer = "No";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 125){
                answer = answer;
                continue;
            }else {
                answer = "Yes";
            }
        }System.out.println(answer);

    }

    public static Integer cheapest(HashMap<String, Integer> products){
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item : products.entrySet()){
            list.add(item.getValue());
        }
        Integer cheapest = mostExpensive(products);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < cheapest){
                cheapest = list.get(i);
            }
        }return cheapest;
    }

}
