package sharpie;

public class Sharpie {

    private String color;
    private float width;
    private float inkAmount = 100;

    public Sharpie(String color, float width){

        this.color = color;
        this.width = width;
    }

    public void use(){

        this.inkAmount--;
    }

    public float getInkAmount(){
        return inkAmount;
    }
}
