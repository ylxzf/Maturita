import java.util.Arrays;
import java.util.Random;

public class Matrices {
    
    static Random random = new Random();

    static int[][] generateMatrix(int row, int column) {
        int[][] result = new int[row][column];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(10);
            }
        }

        return result;
    }

    static int[][] addMatrices(int[][] m1, int[][] m2) {
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            int[][] result = new int[m1.length][m1[0].length];

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = m1[i][j] + m2[i][j];
                }                
            }

            return result;
        }
        else {
            throw new IllegalArgumentException("Matrices are not the same size");
        }
    }

    static int[][] transformMatrix(int[][] m) {
        int[][] result = new int[m[0].length][m.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m[j][i];
            }
        }

        return result;
    }

    static int[][] multiplyMatrices(int[][] m1, int[][] m2) {

        int rowsM1 = m1.length;
        int rowsM2 = m2.length;
        int columnsM1 = m1[0].length;
        int columnsM2 = m2[0].length;

        if (columnsM1 == rowsM2) {
            int[][] result = new int[rowsM1][columnsM2];

            for (int i = 0; i < rowsM1; i++) {
                for (int j = 0; j < columnsM2; j++) {
                    for (int k = 0; k < columnsM1; k++) {
                        result[i][j] += m1[i][k] * m2[k][j]; 
                    }
                }
            }

            return result;
        }
        else {
            throw new IllegalArgumentException(
                "Amount of columns in matrix 1 does not match the amount of rows in matrix 2");
        }
    }

    static void printMatrix(int[][] m) {
        String[][] result = new String[m.length][m[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = String.format("%2d", m[i][j]);
            }
        }

        for (String[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    
    public static void main(String[] args) {
        int[][] m1 = generateMatrix(5, 3);
        int[][] m2 = generateMatrix(3, 4);

        System.out.println("Matrix 1");
        printMatrix(m1);
        System.out.println("\nMatrix 2");
        printMatrix(m2);

        // System.out.println("\nMatrix addition");
        // printMatrix(addMatrices(m1, m2));
        
        System.out.println("\nMatrix 1 transformation");
        printMatrix(transformMatrix(m1));

        System.out.println("\nMatrix multiplication");
        printMatrix(multiplyMatrices(m1, m2));
    }
}