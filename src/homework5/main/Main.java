package homework5.main;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("abc123", 1000);
        CreditCard creditCard2 = new CreditCard("def456", 5000);
        CreditCard creditCard3 = new CreditCard("ghi789", 8000);
        creditCard1.cardInfo();
        creditCard2.cardInfo();
        creditCard3.cardInfo();
        System.out.println("card balance after transactions:");
        creditCard1.plusMoneyToCard(876);
        creditCard1.cardInfo();
        creditCard2.plusMoneyToCard(2345636);
        creditCard2.cardInfo();
        creditCard3.minusMoneyToCard(6666);
        creditCard3.cardInfo();
    }
}
