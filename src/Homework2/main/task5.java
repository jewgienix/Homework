package Homework2.main;

import java.util.Scanner;

//5. По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.).
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rainbow colour");
        int colour = scanner.nextInt();
        if (colour == 1) {
            System.out.println("red");
        } else if (colour == 2) {
            System.out.println("orange");
        } else if (colour == 3) {
            System.out.println("yellow");
        } else if (colour == 4) {
            System.out.println("green");
        } else if (colour == 5) {
            System.out.println("blue");
        } else if (colour == 6) {
            System.out.println("dark blue");
        } else if (colour == 7) {
            System.out.println("purple");
        } else {
            System.out.println("unknown colour");
        }

    }
}
