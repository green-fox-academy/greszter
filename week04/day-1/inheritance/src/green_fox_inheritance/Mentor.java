package green_fox_inheritance;

public class Mentor extends Person{

    protected String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void introduce() {
        super.introduce();
    }

    @Override
    public String specificIntroduction() {
        return (" " + level + "mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
}


