import java.util.Arrays;

public class MatrixOperationsTwo {

    public static void main(String[] args) {

        int[][] mat2 = buildMatrix(2, 2);
        int[][] mat3 = buildMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        print(mat2);

        System.out.println("\nTranspose:");
        print(transpose(mat2));

        double d2 = det2(mat2);
        System.out.println("\nDeterminant (2x2): " + d2);

        System.out.println("\nInverse (2x2):");
        print(inverse2(mat2));

        System.out.println("\n3x3 Matrix:");
        print(mat3);

        System.out.println("\nTranspose:");
        print(transpose(mat3));

        double d3 = det3(mat3);
        System.out.println("\nDeterminant (3x3): " + d3);

        System.out.println("\nInverse (3x3):");
        print(inverse3(mat3));
    }

    // Creates a matrix with random values between 0 and 9
    static int[][] buildMatrix(int r, int c) {
        int[][] data = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                data[i][j] = (int) (Math.random() * 10);
            }
        }
        return data;
    }

    // Returns transpose of a matrix
    static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    // Determinant of 2x2 matrix
    static double det2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix using expansion
    static double det3(int[][] m) {
        double a = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        double b = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        double c = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return a - b + c;
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2(int[][] m) {
        double det = det2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // Inverse of 3x3 matrix using adjugate method
    static double[][] inverse3(int[][] m) {
        double det = det3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Prints integer matrix
    static void print(int[][] m) {
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Prints double matrix and handles non-invertible case
    static void print(double[][] m) {
        if (m == null) {
            System.out.println("Matrix not invertible.");
            return;
        }
        for (double[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}

