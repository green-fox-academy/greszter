package zoo;

import flyable.Flyable;

public class Bird extends Animal implements EggLayer, Flyable {

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

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void fly() {
        System.out.println("Flapping wings");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }
}
