package homework2.main;


import java.util.Scanner;

//4. Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("warmly");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("normally");
        } else if (temp <= -20) {
            System.out.println("coldly");
        }

    }
}
