package homework4.additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
public class Task5 {
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
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.deepToString(array));
    }
}
