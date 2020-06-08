package green_fox_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    protected String name;
    protected List<Student> students;
    protected List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + this.name + " cohort has " + this.students.size() + " students and " + mentors.size() + " mentors.");
    }

}

