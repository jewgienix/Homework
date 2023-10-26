package homework6.main;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("111222333", "Samsung", 180);
        Phone phone2 = new Phone("444555666", "Motorola", 195);
        Phone phone3 = new Phone("777888999", "Nokia", 222);

        phone1.infoPhone();
        phone2.infoPhone();
        phone3.infoPhone();

        phone1.receiveCall("Alex");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Vika");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Vova");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Ivan1", "999888777");
        phone2.receiveCall("Ivan2", "666555444");
        phone3.receiveCall("Ivan3", "333222111");

        phone1.sendMessage("213451234", "0784124141", "4564556", "asfdwsf124414", "1245rfs");
    }
}
