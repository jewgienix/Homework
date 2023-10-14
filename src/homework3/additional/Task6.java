package homework3.additional;

import java.util.Arrays;

//6. Создайте массив строк. Заполните его произвольными именами людей.
//Отсортируйте массив.
//Результат выведите на консоль.
public class Task6 {
    public static void main(String[] args) {
        String[] str1 = new String[]{"Vika", "Olya", "Dima", "Alex", "Masha", "Danik", "Alyosha", "Yana"};
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));


    }
}
