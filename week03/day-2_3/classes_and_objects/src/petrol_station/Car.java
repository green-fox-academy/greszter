package petrol_station;

public class Car {

    private int gasAmount;
    private int capacity;

    public Car(){
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getGasAmount(){
        return this.gasAmount;
    }

    public void setGasAmount(int gasAmount){
        this.gasAmount = gasAmount;
    }
}
