package sum;

import java.util.ArrayList;
import java.util.List;

public class SumList {

    List<Integer> list;

    public SumList() {
        this.list = new ArrayList<>();
    }

    public int sum(){
        int sumOfElements = 0;

        for (int i = 0; i < this.list.size(); i++) {
            int numberToAdd = this.list.get(i)==null?0:this.list.get(i);
            sumOfElements = sumOfElements + numberToAdd;
        }return sumOfElements;
    }

    public void add(Integer number) {
        list.add(number);
    }

    public List<Integer> getList() {
        return list;
    }

    public int listLength(){
        return list.size();
    }
}
