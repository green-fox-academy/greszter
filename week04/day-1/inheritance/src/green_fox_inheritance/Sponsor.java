package green_fox_inheritance;

public class Sponsor extends Person{

    protected String company;
    protected int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        super.introduce();
    }

    @Override
    public String specificIntroduction() {
        return (" who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire(){
        this.hiredStudents++;
    }
}




