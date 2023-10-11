package homework2.main;

import java.util.Scanner;

//1. Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор switch-case.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }

    }

}
