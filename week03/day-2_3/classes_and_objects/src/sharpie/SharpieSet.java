package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> sharpieSet;

    public SharpieSet() {
        this.sharpieSet = new ArrayList<>();
    }

//    public boolean isUseable() {
//        for (int i = 0; i < this.sharpieSet.size(); i++) {
//            if (this.sharpieSet.get(i).getInkAmount() > 0) {
//                return true;
//            }
//        }
//        return false;
//    }

    public int countUsable() {
        int numberOfUsableSharpies = 0;
        for (int i = 0; i < this.sharpieSet.size(); i++) {
            if (this.sharpieSet.get(i).getInkAmount() > 0) {
                numberOfUsableSharpies++;
            }
        }
        return numberOfUsableSharpies;
    }

    public List<Sharpie> removeTrash() {
        List<Sharpie> updatedSharpieSet = new ArrayList<>();
        for (int i = 0; i < this.sharpieSet.size(); i++) {
            if (this.sharpieSet.get(i).getInkAmount() > 0) {
                updatedSharpieSet.add(this.sharpieSet.get(i));
            }
        }
        sharpieSet = updatedSharpieSet;
        return updatedSharpieSet;
    }

    public void add(Sharpie sharpie) {
        this.sharpieSet.add(sharpie);
    }

    public void getNumberOfSharpies() {
        System.out.println(this.sharpieSet.size());
    }


}



//    Create SharpieSet class
//
//    it contains a list of Sharpie
//                    countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies


