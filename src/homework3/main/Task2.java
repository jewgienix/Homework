package homework3.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = array[0];
        int min = array[0];
        int average = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            {
                if (array[i] > max) {
                    max = array[i];
                } else if (array[i] > min) {
                    min = array[i];
                }
                average += array[i] / n;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max number of array: " + max);
        System.out.println("Min number of array: " + min);
        System.out.println("Average of array: " + average);
    }
}