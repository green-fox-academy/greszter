package main_java_music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super();
        this.numberOfStrings = 6;
        this.name = "Electric Guitar";
    }

    public ElectricGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
        this.name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }
}




