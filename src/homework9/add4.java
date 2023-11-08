package homework9;
//Дана произвольная строка.
//Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки.
//Например, "Hello" -> "HHeelllloo".

public class add4 {
    public static void main(String[] args) {
        String inputString = "java";
        String duplicatedString = duplicateLetters(inputString);
        System.out.println(duplicatedString);
    }

    public static String duplicateLetters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar).append(currentChar);
        }

        return result.toString();
    }
}
