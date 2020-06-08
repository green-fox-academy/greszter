package the_garden_application;

import java.util.List;

public class Flower extends Plant{

    public Flower(String color) {
        super(color);
        this.type = "Flower";
    }

    @Override
    public double getAbsorb(){
        return 0.75;
    }

    @Override
    public int getMaxWater(){
        return 5;
    }
}

