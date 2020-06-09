package cloneable;

public class Student extends Person implements Cloneable{

    protected String previousOrganization;
    protected int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public String specificIntroduction(){
        return (" from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    public Object clone()throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

