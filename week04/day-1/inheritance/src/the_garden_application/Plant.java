package the_garden_application;

import java.util.Collection;

public class Plant {

    protected double currentWaterAmount;
    protected String color;
    protected double absorb;
    protected String type;
    protected int maxWater;

    public Plant(String color) {
        this.currentWaterAmount = 0;
        this.absorb = 1;
        this.type = "Plant";
        this.color = color;
    }

    public boolean needsWater(){
        return this.currentWaterAmount < (this.getMaxWater() >= 0?this.getMaxWater():0);
    }

    public double getCurrentWaterAmount(){
        return currentWaterAmount;
    }

    public double getAbsorb() {
        return absorb;
    }

    public String getColor() {
        return color;
    }

    public String getType(){
       return type;
    }

    public int getMaxWater(){
        return maxWater;
    }

}
