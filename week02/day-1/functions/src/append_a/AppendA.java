package append_a;

public class AppendA {
    public static void main(String[] args) {
        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        // - Write a function called `appendAFunc` that gets a string as an input,
        //   appends an 'a' character to its end and returns with a string
        //
        // - Print the result of `appendAFunc(typo)`

        String typo = "Chinchill";
        appendAFunc(typo);

    }

    public static void appendAFunc(String input){
        System.out.println(input + "a");
    }
}
