package homework3.additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//4. Создайте массив из n случайных целых чисел и выведите его на экран.
//Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
//Если n не удовлетворяет условию - выведите сообщение об этом.
//Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = 0;
        while (n <= 5) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 5) {
                    System.out.println("Enter number > 5:");
                } else if (n > 10) {
                    System.out.println("Enter number <=10:");
                }
            } else {
                System.out.println("error number:");
                sc.next();
            }
        }
        int[] arr1 = new int[n];
        int evenNums = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (n + 1));
            if (arr1[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}