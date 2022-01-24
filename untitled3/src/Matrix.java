import java.util.Random;

/**
 * @author Ilya Grishin
 */
public class Matrix {
    public void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i = 0; i < matrix[1].length; i++) {
                System.out.print(ints[i]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] createMatrix(int first, int second, Random r) {
        int ran1;
        int[][] a = new int[first][second];
        for (int j = 0; j < first; j++) {
            for (int i = 0; i < second; i++) {
                ran1 = r.nextInt(100);
                a[j][i] = ran1;                // Сохраняется в массиве
            }
        }
        return a;
    }

    public void sum(int[][] matrix, int[][] matrix1) {
        System.out.println("Сложение матрицы равно:");
        // Реализуем сложение двух матриц
        int[][] c;
        c = new int[matrix.length][matrix[1].length];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[1].length; i++) {
                c[j][i] = matrix[j][i] + matrix1[j][i];
                System.out.print(c[j][i]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public Random random(int maxValue) {
        return new Random(maxValue);
    }

}
