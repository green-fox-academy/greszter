package zoo;

public class Mammal extends Animal{

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }
}
