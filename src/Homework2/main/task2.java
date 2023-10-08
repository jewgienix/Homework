package Homework2.main;
//2. Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор if-else-if.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");


        int monthNumber = scanner.nextInt();
        if (monthNumber == 1) {
            System.out.println("Winter");
        } else if (monthNumber == 2) {
            System.out.println("Winter");
        } else if (monthNumber == 3) {
            System.out.println("Spring");
        } else if (monthNumber == 4) {
            System.out.println("Spring");
        } else if (monthNumber == 5) {
            System.out.println("Spring");
        } else if (monthNumber == 6) {
            System.out.println("Summer");
        } else if (monthNumber == 7) {
            System.out.println("Summer");
        } else if (monthNumber == 8) {
            System.out.println("Summer");
        } else if (monthNumber == 9) {
            System.out.println("Autumn");
        } else if (monthNumber == 10) {
            System.out.println("Autumn");
        } else if (monthNumber == 11) {
            System.out.println("Autumn");
        } else if (monthNumber == 12) {
            System.out.println("Winter");
        } else {
            System.out.println("Error");
        }


    }
}
