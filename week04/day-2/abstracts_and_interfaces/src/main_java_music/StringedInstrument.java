package main_java_music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;

    public StringedInstrument() {
        super();
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
    }

    public void setNumberOfStrings(int number){
        this.numberOfStrings = number;
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + numberOfStrings + "-stringed instrument that goes " + this.sound());

    }

    public abstract String sound();

}
