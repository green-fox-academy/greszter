package draw_diagonal;

import java.util.Scanner;
public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++){
            System.out.print("%");
        }
        System.out.println();

        for (int i = 1; i <= (userNumber - 2); i++){
            System.out.print("%");
            if (i % 3 == 0){
                for (int j = 1; j <= (userNumber - 2) / 3; j++)
                    System.out.print("%  ");
            }else if (i % 3 == 1){
                for (int j = 1; j <= (userNumber - 2) / 3; j++)
                    System.out.print(" % ");
            }else {
                for (int j = 1; j <= (userNumber - 2) / 3; j++)
                    System.out.print("  %");
            }
            if (userNumber % 3 == 0){
                if (i % 3 != 0) {
                    System.out.print(" %");
                }else {
                    System.out.print("%%");
                }
            } else if (userNumber % 3 == 1){
                if (i % 3 == 0){
                    System.out.print("% %");
                } else if (i % 3 == 1){
                    System.out.print(" %%");
                } else {
                    System.out.print("  %");
                }
            } else {
                System.out.print("%");
            }
            System.out.println();
        }

        for (int i = 1; i <= userNumber; i++){
            System.out.print("%");
        }
    }


    }

