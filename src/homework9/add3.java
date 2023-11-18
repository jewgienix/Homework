package homework9;
//Дана строка произвольной длины с произвольными словами.
//Написать программу для проверки является ли любое выбранное слово в
//строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить
//является ли 3-е слово в этой строке палиндромом. Предусмотреть предупреждающие сообщения на случаи ошибочных
//ситуаций: например, в строке 5 слов, а на вход программе передали число
//500 и т. п. ситуации.
import java.util.Scanner;

public class add3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+"); // Разбиваем строку на слова по пробелам

        System.out.print("Введите номер слова для проверки (1-" + words.length + "): ");
        int wordNumber = scanner.nextInt();

        if (wordNumber < 1 || wordNumber > words.length) {
            System.out.println("Некорректный номер слова. В строке " + words.length + " слов.");
            return;
        }

        String selectedWord = words[wordNumber - 1];
        boolean isPalindrome = isPalindrome(selectedWord);

        if (isPalindrome) {
            System.out.println("Слово '" + selectedWord + "' является палиндромом.");
        } else {
            System.out.println("Слово '" + selectedWord + "' не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
