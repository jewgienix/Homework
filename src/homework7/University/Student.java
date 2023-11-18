package homework7.University;

public class Student {
    private String firstName;
    private String lastName;
    private String groupNumber;
    private String residence;

    public Student(String firstName, String lastName, String groupNumber, String residence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.residence = residence;
    }

    public void displayInfo() {
        System.out.println("Студент: " + firstName + " " + lastName);
        System.out.println("Номер группы: " + groupNumber);
        System.out.println("Место проживания: " + residence);
    }
}
