package Homework2.main;

import java.util.Scanner;

//3. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner.
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter valid number");
            scanner.next();
        }
        int j = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= j; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
