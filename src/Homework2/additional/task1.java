package Homework2.additional;

//1. Выведите на экран первые 11 членов последовательности Фибоначчи.
public class task1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

    }
}
