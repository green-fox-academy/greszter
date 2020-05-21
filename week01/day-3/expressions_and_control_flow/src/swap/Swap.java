package swap;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("original a: " + a);
        System.out.println("original b: " + b);

        System.out.println();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("value of a after swapping: " + a);
        System.out.println("value of b after swapping: " + b);


    }
}

