package sharpie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sharpie black = new Sharpie("black", 0.75f);
        Sharpie blue = new Sharpie("blue", 1.25f);
        Sharpie red = new Sharpie("red", 2.5f);

       // List<Sharpie> sharpies = new ArrayList<>();

        SharpieSet sharpies = new SharpieSet();

        sharpies.add(black);
        sharpies.add(blue);
        sharpies.add(red);


        System.out.println("Black: " + black.getInkAmount());
        System.out.println("Blue: " + blue.getInkAmount());
        black.use();
        black.use();
        blue.use();
        System.out.println("Black: " + black.getInkAmount());
        System.out.println("Blue: " + blue.getInkAmount());
        black.use();
        black.use();
        black.use();
        black.use();
        black.use();
        black.use();
        black.use();
        black.use();

        System.out.println("Black: " + black.getInkAmount());
        System.out.println("Blue: " + blue.getInkAmount());
        System.out.println("Red: " + red.getInkAmount());

        System.out.print("Number of sharpies: ");
        sharpies.getNumberOfSharpies();
        System.out.println("Usable sharpies: " + sharpies.countUsable());

        sharpies.removeTrash();

        System.out.print("Number of sharpies: ");
        sharpies.getNumberOfSharpies();
        System.out.println("Usable sharpies: " + sharpies.countUsable());



    }
}
