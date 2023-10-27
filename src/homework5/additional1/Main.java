package homework5.additional1;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(700, "Macbook", 16,512);

        Computer computer1 = new Computer(800, "MacBookAIR", 8,256);
        Computer computer2 = new Computer(1700, "MacBookPro", 16,1024);

        computer1.infoComputer();
        computer2.infoComputer();
    }
}
