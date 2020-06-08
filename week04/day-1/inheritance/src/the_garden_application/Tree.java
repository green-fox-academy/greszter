package the_garden_application;

public class Tree extends Plant{

    public Tree(String color) {
        super(color);
        this.absorb = 0.4;
        this.type = "Tree";
    }

    @Override
    public boolean needsWater(){
        if (this.currentWaterAmount < 10){
            return true;
        }else return false;
    }
}


