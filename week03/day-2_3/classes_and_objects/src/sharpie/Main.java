package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie black = new Sharpie("black", 0.75f);
        Sharpie blue = new Sharpie("blue", 1.25f);


        System.out.println("Black: " + black.getInkAmount());
        System.out.println("Blue: " + blue.getInkAmount());
        black.use();
        black.use();
        blue.use();
        System.out.println("Black: " + black.getInkAmount());
        System.out.println("Blue: " + blue.getInkAmount());


    }
}
