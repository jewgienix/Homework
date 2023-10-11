package homework2.main;
//5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
public class Task10 {
    public static void main(String[] args){
        for (int i = 0;; i -= 5) {
            if (i < -50)
                break;
            System.out.println(i);
        }




    }
}
