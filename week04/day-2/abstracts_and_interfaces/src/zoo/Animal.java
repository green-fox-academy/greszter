package zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected int speed;

    public abstract String getName();

    public abstract String breed();

    public abstract void eat();

    public abstract void drink();

}
