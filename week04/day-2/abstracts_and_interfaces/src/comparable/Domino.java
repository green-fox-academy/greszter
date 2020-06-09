package comparable;

import java.util.List;

public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    public String toString(Domino domino){
        return domino.toString();
    }


    @Override
    public int compareTo(Domino o) {
        return Integer.compare(this.getLeftSide(), o.getLeftSide());
    }
}
