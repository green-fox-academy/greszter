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

        this.inkAmount -= 10;
    }

    public float getInkAmount(){
         int realInkAmount = inkAmount > 0 ? (int) inkAmount : 0;
         return realInkAmount;
    }

    public void setInkAmount(float inkAmount) {
        this.inkAmount = inkAmount;
    }
}
