package printable;

public class DominoApp {
    public static void main(String[] args) {

        Domino domino1 = new Domino(2, 4);
        Domino domino2 = new Domino(6, 3);
        Domino domino3 = new Domino(5, 2);
        Domino domino4 = new Domino(3, 6);
        Domino domino5 = new Domino(4, 1);

        domino1.printAllFields();
        domino2.printAllFields();
        domino3.printAllFields();
        domino4.printAllFields();
        domino5.printAllFields();


    }
}
