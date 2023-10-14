package homework3.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scanner.nextInt();
        int[] array = new int[]{2, 6, 18, 79, 145, 89, 634, 7940, 357};
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                switch (array[i] = 0){
                }
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println("enter correct number");
        }
        System.out.println(Arrays.toString(array));
    }
}
