package the_garden_application;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    protected List<Plant> treesAndFlowers;

    public Garden() {
        this.treesAndFlowers = new ArrayList<>();
    }

    public void needsWaterInfo(){
        for (int i = 0; i < treesAndFlowers.size(); i++) {
            if (treesAndFlowers.get(i).needsWater() == true){
                    System.out.println("This " + treesAndFlowers.get(i).getColor() + " " + treesAndFlowers.get(i).getType() + " needs water.");
                }else
                    System.out.println("This " + treesAndFlowers.get(i).getColor() + " " + treesAndFlowers.get(i).getType() + " doesn't need water.");
            }
        }

    public void water(double waterAmount){
        List<Plant> needsWatering = new ArrayList();
        for (int i = 0; i < treesAndFlowers.size(); i++) {
            if (treesAndFlowers.get(i).needsWater()){
                needsWatering.add(treesAndFlowers.get(i));
            }
        }
        for (int i = 0; i < needsWatering.size(); i++) {
            needsWatering.get(i).currentWaterAmount += ((waterAmount / needsWatering.size()) * needsWatering.get(i).getAbsorb());
        }
        System.out.println("Watering with " + waterAmount);
    }

    public void add(Plant plant){
        this.treesAndFlowers.add(plant);
    }

}

