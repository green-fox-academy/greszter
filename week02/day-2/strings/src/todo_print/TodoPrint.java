package todo_print;

public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo



        String myTodo = "My todo:\n";

        StringBuilder updatedTodo = new StringBuilder(todoText);

        updatedTodo.insert(0, myTodo);

        updatedTodo.append(" - Download games\n");
        updatedTodo.append(" \t- Diablo");

        System.out.println(updatedTodo.toString());

    }
}
