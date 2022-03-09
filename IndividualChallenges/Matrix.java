public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
    // store matrix

    // Hack: create toString method using nested for loops to format output of a matrix
    public static String[][] toString(Matrix matrix) {
        String[][] matrixupdated = new String[3][4];
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixupdated[i][j] = Integer.toString(matrix[i][j]);
            }
        }
        return matrixupdated;
    }


    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{{0, 1},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}};
    }

    // tester method for matrix formatting
    public static void main(String[] args) {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(toString(m1));
    }

}