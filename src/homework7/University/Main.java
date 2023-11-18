package homework7.University;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1) Добавление студента в университет");
            System.out.println("2) Добавление сотрудника в университет");
            System.out.println("3) Добавление общежития в университет");
            System.out.println("4) Просмотр всех студентов");
            System.out.println("5) Просмотр всех сотрудников");
            System.out.println("6) Просмотр всех общежитий");
            System.out.println("7) Выход");
            System.out.print("Выберите пункт: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Имя студента: ");
                    String firstName = scanner.next();
                    System.out.print("Фамилия студента: ");
                    String lastName = scanner.next();
                    System.out.print("Номер группы: ");
                    String groupNumber = scanner.next();
                    System.out.print("Место проживания: ");
                    String residence = scanner.next();
                    university.addStudent(firstName, lastName, groupNumber, residence);
                    break;
                case 2:
                    System.out.print("Имя сотрудника: ");
                    String empFirstName = scanner.next();
                    System.out.print("Фамилия сотрудника: ");
                    String empLastName = scanner.next();
                    System.out.print("Должность: ");
                    String position = scanner.next();
                    university.addEmployee(empFirstName, empLastName, position);
                    break;
                case 3:
                    System.out.print("Адрес общежития: ");
                    String address = scanner.next();
                    System.out.print("Название общежития: ");
                    String name = scanner.next();
                    university.addDormitory(address, name);
                    break;
                case 4:
                    university.displayStudents();
                    break;
                case 5:
                    university.displayEmployees();
                    break;
                case 6:
                    university.displayDormitories();
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        } while (choice != 7);
    }
}
