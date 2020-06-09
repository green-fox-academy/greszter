package printable;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    public static void main(String[] args) {

    Todo todo1 = new Todo("Buy milk", "high", true);
    Todo todo2 = new Todo("Buy cheese", "low", false);
    Todo todo3 = new Todo("Go to the gym", "high", false);

    todo1.printAllFields();
    todo2.printAllFields();
    todo3.printAllFields();


    }
}
