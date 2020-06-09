package zoo;

public class Reptile extends Animal implements EggLayer{

    public Reptile(String name) {
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
