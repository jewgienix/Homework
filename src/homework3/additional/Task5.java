package homework3.additional;

import java.util.Arrays;

//5. Создайте массив и заполните массив.
//Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
public class Task5 {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 15, 789, 55, 9082, 66, 15267};

        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
