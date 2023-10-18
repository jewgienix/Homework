package homework4.additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
public class Task3 {
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
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of array: " + sum);
    }
}
