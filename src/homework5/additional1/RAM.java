package homework5.additional1;

public class RAM {
    String name;
    int amount;

    RAM(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    void infoRAM() {
        System.out.println("Name: " + name + " Amount: " + amount);
    }

}
