package homework7.University;

public class Dormitory {
    private String address;
    private String name;

    public Dormitory(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Общежитие: " + name);
        System.out.println("Адрес: " + address);
    }
}
