import java.util.Arrays;

public class MatrixOperations {

    public static void main(String[] args) {

        int r = 3, c = 3;

        int[][] first = createMatrix(r, c);
        int[][] second = createMatrix(r, c);

        System.out.println("First Matrix:");
        printMatrix(first);

        System.out.println("\nSecond Matrix:");
        printMatrix(second);

        System.out.println("\nMatrix Addition:");
        printMatrix(add(first, second));

        System.out.println("\nMatrix Subtraction:");
        printMatrix(subtract(first, second));

        System.out.println("\nMatrix Multiplication:");
        printMatrix(multiply(first, second));
    }

    // Generates a matrix filled with random single-digit numbers
    static int[][] createMatrix(int r, int c) {
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
        return mat;
    }

    // Adds two matrices
    static int[][] add(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // Subtracts second matrix from first
    static int[][] subtract(int[][] a, int[][] b) {
        int[][] diff = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                diff[i][j] = a[i][j] - b[i][j];
            }
        }
        return diff;
    }

    // Multiplies two matrices
    static int[][] multiply(int[][] a, int[][] b) {
        int[][] product = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    // Prints matrix in readable format
    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
