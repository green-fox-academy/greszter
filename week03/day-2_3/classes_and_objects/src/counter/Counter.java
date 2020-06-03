package counter;

public class Counter {

    private int initialValue;
    private int value;


    public Counter(){
        this.initialValue = 0;
        this.value = 0;
    }

    public Counter(int value){
        this.value = value;
        this.initialValue = value;
    }

    public void add(int number) {
        this.value += number;
    }

    public void add(){
        this.value++;
    }

    public int get(){
        return this.value;
    }

    public void reset(){
        this.value = this.initialValue;
    }

}
