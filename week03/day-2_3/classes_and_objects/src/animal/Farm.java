package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> farm;
    int numberOfSlots;

    public Farm(int slots){
        this.farm = new ArrayList<>();
        this.numberOfSlots = slots;
    }

    public void breed(Animal animal){
        if (this.farm.size() < numberOfSlots){
           this.farm.add(animal);
        }else
            System.out.println("Farm is full");
    }

    public void slaughter(){
        int minHunger = 0;
        Animal removable = new Animal();
        for (int i = 0; i < this.farm.size(); i++) {
            if (this.farm.get(i).getHunger() > minHunger){
                minHunger = this.farm.get(i).getHunger();
                removable = this.farm.get(i);
            }
        }
        this.farm.remove(removable);

    }

    public int numberOfAnimals(){
        return this.farm.size();
    }

//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal
}
