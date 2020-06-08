package the_garden_application;

import java.util.List;

public class Flower extends Plant{

    public Flower(String color) {
        super(color);
        this.absorb = 0.75;
        this.type = "Flower";
    }

    @Override
    public boolean needsWater(){
        if (this.currentWaterAmount < 5){
            return true;
        }else return false;
    }
}

