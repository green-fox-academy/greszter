package matrix;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] matrix = new int[4][4];

        int a = 0;
        int b = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    System.out.print(b + " ");
                } else {
                    System.out.print(a + " ");
                }
            }
            System.out.println();
        }
    }
}