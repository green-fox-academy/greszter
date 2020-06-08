package the_garden_application;

public class GardenApp {

    public static void main(String[] args) {

        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        garden.add(yellow);
        Flower blue = new Flower("blue");
        garden.add(blue);
        Tree purple = new Tree ("purple");
        garden.add(purple);
        Tree orange = new Tree("orange");
        garden.add(orange);


        garden.needsWaterInfo();

        garden.water(40);

        garden.needsWaterInfo();

        garden.water(70);

        garden.needsWaterInfo();

    }
}





