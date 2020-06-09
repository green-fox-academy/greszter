package printable;

public class Domino implements Printable{

    protected int leftSide;
    protected int rightSide;

    public Domino(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + getLeftSide() + ", B side: " + getRightSide());
    }
}
