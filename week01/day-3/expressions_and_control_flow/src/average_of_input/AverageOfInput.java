package average_of_input;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        //int userInput1 = scanner.nextInt();
        //int userInput2 = scanner.nextInt();
        //int userInput3 = scanner.nextInt();
        //int userInput4 = scanner.nextInt();
       // int userInput5 = scanner.nextInt();

        // int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;

        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Specify a number:");
            int number = scanner.nextInt();
            sum = sum + number;
        }

        double avg = (double) sum / 5;



        System.out.println("Sum: " + sum + ", Average: " + avg);



    }

}
