package mile_to_km_converter;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Miles:");
        double userInput1 = scanner.nextDouble();

        System.out.println("It is " + (userInput1 * 1.609344) + " km.");



    }
}
