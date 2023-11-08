package homework9;

//Дана строка произвольной длины с произвольными словами.
//Найти самое короткое слово в строке и вывести его на экран.
//Найти самое длинное слово в строке и вывести его на экран.
//Если таких слов несколько, то вывести последнее из них.
public class add1 {
    public static void main(String[] args) {
        String inputString = "hello java homework 33 yolo j";

        String[] words = inputString.split("\\s+");

        String shortestWord = null;
        String longestWord = null;

        for (String word : words) {
            if (shortestWord == null || word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (longestWord == null || word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The shortest word: " + shortestWord);
        System.out.println("The shortest word: " + longestWord);
    }
}
