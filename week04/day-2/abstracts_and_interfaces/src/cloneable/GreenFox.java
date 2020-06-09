package cloneable;

import java.util.ArrayList;

public class GreenFox {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);

        Student studentToBeCloned = new Student("John", 20, "male", "BME");
        try {
            Student jonhTheClone = (Student) studentToBeCloned.clone();
            jonhTheClone.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

//            student.skipDays(3);
//
//            for (Person person : people) {
//                person.introduce();
//                person.getGoal();
        }
    }
}

