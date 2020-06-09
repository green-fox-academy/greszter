package printable;

import java.util.ArrayList;

public class Todo implements Printable{

    protected String task;
    protected String priority;
    protected boolean completed;

    public Todo(String task, String priority, boolean completed) {
        this.task = task;
        this.priority = priority;
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void printAllFields() {
        System.out.println(getTask() + " | Priority: " + getPriority() + " | Done: " + isCompleted());
    }
}
