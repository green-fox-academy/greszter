package flyable;

public class Helicopter extends Vehicle implements Flyable{


    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }
}
