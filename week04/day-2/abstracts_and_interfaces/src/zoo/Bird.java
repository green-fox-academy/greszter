package zoo;

public class Bird extends Animal implements EggLayer{

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return this.layEgg();
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public String layEgg() {
        return "laying eggs";
    }
}
