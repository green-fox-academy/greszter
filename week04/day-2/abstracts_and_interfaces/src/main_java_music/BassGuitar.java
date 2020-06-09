package main_java_music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        super();
        this.numberOfStrings = 4;
        this.name = "Bass Guitar";
    }

    public BassGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
        this.name = "Bass Guitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
