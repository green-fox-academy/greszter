package cuboid;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double sideA = 12;
        double sideB = 25;
        double sideC = 7;

        double surface = ((sideA * sideB) * 2) + ((sideA * sideC) * 2) + sideB * sideC * 2;
        System.out.println("Surface Area: " + surface);

        System.out.println("Volume: " + sideA * sideB * sideC);

    }
}
