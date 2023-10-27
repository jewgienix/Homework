package homework5.computer;

public class Computer {
    double price;
    String model;
    HDD hdd;
    RAM ram;

    public Computer(){
        price = 800;
        model = "Comp123";
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.hdd = new HDD("Seagate", 512, "internal");
        this.ram = new RAM("Hikoki", 24);
    }
    public void info(){
        System.out.println("Price: " + price + " \nmodel:" + model + " \nHDD: " + hdd + " \nRAM: " + ram);
    }
}
