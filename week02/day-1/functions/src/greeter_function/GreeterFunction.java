package greeter_function;

public class GreeterFunction {
    public static void main(String[] args) {
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`

        String al = "Green Fox";
        greet(al);
        
    }

    public static void greet(String name){
        System.out.println("Greetings dear, " + name);
    }
}
