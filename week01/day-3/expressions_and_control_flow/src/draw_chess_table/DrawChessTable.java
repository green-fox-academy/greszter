package draw_chess_table;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %

        int numberOfLines = 8;
        int numberOfCharacters = 4;

        for (int i = 0; i < numberOfLines; i++){
            for (int j = 0; j < numberOfCharacters; j++){
                if ((i % 2) == 0){
                System.out.print("% ");
            } else {
                System.out.print(" %");
            }
            }
            System.out.println();
        }
    }
}
