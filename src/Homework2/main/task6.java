package Homework2.main;

//1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//При решении используйте операцию инкремента (++).
public class task6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i = i += 2) {
            System.out.println(i);

        }

    }
}
