package main_java_music;

public class Violin extends StringedInstrument{

    public Violin() {
        super();
        this.numberOfStrings = 4;
        this.name = "Violin";
    }

    public Violin(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
        this.name = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }
}

