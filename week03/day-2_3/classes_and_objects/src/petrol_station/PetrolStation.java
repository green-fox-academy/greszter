package petrol_station;

public class PetrolStation {
    public static void main(String[] args) {

//
//                Station
//        gasAmount
//        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//        Car
//                gasAmount
//        capacity
//        create constructor for Car where:
//        initialize gasAmount -> 0
//        initialize capacity -> 100

        Station station = new Station();
        Car car = new Car();

        System.out.println(car.getGasAmount());

        station.refill(car);

        System.out.println(car.getGasAmount());
        System.out.println(station.getGasAmount());

    }
}
