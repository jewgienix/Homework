package Homework2.additional;

//3. Напишите программу, которая выводит на консоль таблицу умножения.
public class task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
