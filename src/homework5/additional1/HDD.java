package homework5.additional1;

public class HDD {
    String name;
    int amount;
    String type;

    HDD(String name, int amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    void infoHDD() {
        System.out.println("Name: " + name + " amount:" + amount + " type: " + type);
    }
}
