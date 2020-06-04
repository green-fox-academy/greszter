package teachers_and_students;

public class TeachersAndStudents {
    public static void main(String[] args) {
//        Student//
//        learn() -> prints the student is learning something new
//        question(teacher) -> calls the teachers answer method
//
//                Teacher
//
//        teach(student) -> calls the students learn method
//        answer() -> prints the teacher is answering a question
//
//        Instantiate a Student and Teacher object
//        Call the student's question() method and the teacher's teach() method

    Student student = new Student();
    Teacher teacher = new Teacher();


    student.question();
    teacher.teach();


    }
}
