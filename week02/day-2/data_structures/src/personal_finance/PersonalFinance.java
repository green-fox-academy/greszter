package personal_finance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> finances = new ArrayList<>();

        Collections.addAll(finances, 500, 1000, 1250, 175, 800, 120);

        int sum = 0;

        for (int i = 0; i < finances.size(); i++){
            sum = (sum + finances.get(i));
        }
        System.out.println("We spent: " + sum);

        System.out.println("Our greatest expense was: " + Collections.max(finances));

        System.out.println("Our cheapest spending was: " + Collections.min(finances));

        System.out.println("Average amount of our spendings: " + ((double) sum / finances.size()));


    }
}
