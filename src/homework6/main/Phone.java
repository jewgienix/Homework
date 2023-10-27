package homework6.main;
//1. Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void infoPhone() {
        System.out.println("Number: " + number + " Model: " + model + " Weight: " + weight);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Call:" + name);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){
    }
    public void receiveCall(String callerName, String callerNumber){
        System.out.println("Call: " + callerName + "," + " Number: " + callerNumber);
    }

    public void sendMessage (String... phoneNumbers){
            System.out.println("Send message to: ");
            for (String phoneNumber : phoneNumbers){
                System.out.println(phoneNumber);
            }
        }
}
