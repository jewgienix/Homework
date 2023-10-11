package homework2.additional;


import java.util.Scanner;

//2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum: ");
        float sum = scanner.nextFloat();
        System.out.println("Enter months amount: ");
        int month = scanner.nextInt();
        for (int i = 0; i < month; i++){
            sum = sum + (sum * 0.07f);
        }
        System.out.println("Your deposit after " + month + " month = " + sum);









    }
}
