package homework7.University;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Сотрудник: " + firstName + " " + lastName);
        System.out.println("Должность: " + position);
    }
}
