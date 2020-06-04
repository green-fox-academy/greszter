package teachers_and_students;

public class Teacher {

    private String teacher;

    public Teacher(){
    }

    public void answer(){
        System.out.println("The teacher is answering a question");
    }

    public void teach(Student student){
        student.learn();
    }
}
