package homework3.main;

import java.util.Arrays;
import java.util.Scanner;

//0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int a = scanner.nextInt();
        int[] arr = new int[]{1, 3, 6, 8, 10, 5, 77, 53};
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                System.out.println(a + " this number is in the array");
                break;
            } else {
                System.out.println(a + " this number is not in the array");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}