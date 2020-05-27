package divide_by_zero;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        System.out.println("Add a number:");

        try {

            Scanner scanner = new Scanner(System.in);
            int newNumber = scanner.nextInt();

            int result = 10 / newNumber;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }

    }


}
