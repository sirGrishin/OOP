import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность матриц");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        Matrix matrixClass = new Matrix();
        //Генерация случайных чисел до определенного числа
        Random random = matrixClass.random(100);
        //создание двух рандомных матриц
        int[][] matrix = matrixClass.createMatrix(first, second, random);
        int[][] matrix1 = matrixClass.createMatrix(first, second, random);

        // распечатываем первую матрицу
        matrixClass.print(matrix);
        // распечатываем вторую матрицу
        matrixClass.print(matrix1);

        //выводим результат
        matrixClass.sum(matrix, matrix1);

    }
}