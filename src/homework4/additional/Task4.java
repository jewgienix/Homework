package homework4.additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//4. Создайте двумерный массив. Выведите на консоль диагонали массива.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j)
                    System.out.println("main diagonal " + array[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array.length - i - 1 == j)
                    System.out.println("side diagonal " + array[i][j]);
            }
        }
    }
}
