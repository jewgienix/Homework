package homework3.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.
public class Task1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number from 10 to 6: ");
        int[] array = new int[]{10,9,8,7,6};
        int z = 0;
        if (input.hasNextInt())
        {int q = input.nextInt();
            for (int i = 0; i < array.length; i++)
            {
                if (array[i]==q)
                {
                    array[i]=0;
                }
                else
                {
                    z++;
                }
            }
            if (z==5)
            {
                System.out.println("This number is not in the array!");
            }
        }
        else
        {
            System.out.println("Error, enter the correct number: ");
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
