package the_garden_application;

public class Tree extends Plant{

    public Tree(String color) {
        super(color);
        this.type = "Tree";
    }

    @Override
    public double getAbsorb(){
        return 0.4;
    }

    @Override
    public int getMaxWater(){
        return 10;
    }
}


