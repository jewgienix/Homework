package homework5.main;

//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
    String cardNumber;
    int cardBalance;
    CreditCard(String cardNumber, int cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }
    void cardInfo() {
        System.out.println("Card number: " + cardNumber + " Balance: " + cardBalance);
    }
    void plusMoneyToCard(int money) {
        this.cardBalance += money;
    }

    void minusMoneyToCard(int money) {
        this.cardBalance -= money;
    }
}


