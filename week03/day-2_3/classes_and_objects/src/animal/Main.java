package animal;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println("Hunger: " + cat.getHunger());
        System.out.println("Thirst: " + cat.getThirst());
        cat.play();
        System.out.println("Hunger: " + cat.getHunger());
        System.out.println("Thirst: " + cat.getThirst());
        cat.play();
        System.out.println("Hunger: " + cat.getHunger());
        System.out.println("Thirst: " + cat.getThirst());
        cat.drink();
        cat.eat();
        System.out.println("Hunger: " + cat.getHunger());
        System.out.println("Thirst: " + cat.getThirst());
        cat.drink();
        cat.eat();
        System.out.println("Hunger: " + cat.getHunger());
        System.out.println("Thirst: " + cat.getThirst());
    }
}
