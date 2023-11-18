package homework9;
//Дана строка произвольной длины с произвольными словами.
//Найти слово, в котором число различных символов минимально. Слово
//может содержать буквы и цифры. Если таких слов несколько, найти первое
//из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
//быть "fffff".
public class add2 {
    public static void main(String[] args) {
        String inputString = "fffff ab f 3535 jkjk";

        String[] words = inputString.split("\\s+");

        String shortestWord = null;
        int minUniqueChars = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueCharsCount = countUniqueChars(word);
            if (uniqueCharsCount < minUniqueChars) {
                minUniqueChars = uniqueCharsCount;
                shortestWord = word;
            }
        }

        System.out.println("Слово с минимальным числом различных символов: " + shortestWord);
    }

    public static int countUniqueChars(String word) {
        word = word.toLowerCase();

        int uniqueChars = 0;
        boolean[] charExists = new boolean[1000];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!charExists[c]) {
                charExists[c] = true;
                uniqueChars++;
            }
        }

        return uniqueChars;
    }
}
