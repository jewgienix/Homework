package homework4.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = scanner.nextInt();
        System.out.println("Please enter m");
        int m = scanner.nextInt();
        System.out.println("Please enter l");
        int l = scanner.nextInt();
        Random random = new Random();
        int[][][] array = new int[n][m][l];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(100);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("how much to increase the array: ");
        int v = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += v;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }
    }
}