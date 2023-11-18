package homework7.University;
//Делаем классы для работы с университетом.
// В универе есть массив студентов, сотрудников и общежитий.
// Студенты (поля имя, фамилия, номер группы, место проживания), сотрудники (поля имя, фамилия, должность - препод, декан, ректор и т д), общежитие (адрес, название, массив комнат).
// Сделать меню с 6 пунктами:
// 1) Добавление студента в универ
// 2) Добавление сотрудника в универ
// 3) Заселить студента в общежитие
// 4) Просмотр всех студентов
// 5) Просмотр всех сотрудников
// 6) Выход.
//Выше описаны минимальные классы, подумать чего еще не хватает, подумать как с точки зрения классов сделать заселение - хочу по студенту знать его общежитие и комнату.
// Меня не интересует тут проверки на ввод и т д, но интересует соблюдение принципов ооп, работа с классами, методами и т д

public class University {
    private Student[] students;
    private Employee[] employees;
    private Dormitory[] dormitories;
    private int studentCount;
    private int employeeCount;
    private int dormitoryCount;

    public University() {
        students = new Student[100];
        employees = new Employee[50];
        dormitories = new Dormitory[10];
        studentCount = 0;
        employeeCount = 0;
        dormitoryCount = 0;
    }

    public void addStudent(String firstName, String lastName, String groupNumber, String residence) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(firstName, lastName, groupNumber, residence);
            studentCount++;
            System.out.println("Студент добавлен в университет.");
        } else {
            System.out.println("Невозможно добавить больше студентов.");
        }
    }

    public void addEmployee(String firstName, String lastName, String position) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = new Employee(firstName, lastName, position);
            employeeCount++;
            System.out.println("Сотрудник добавлен в университет.");
        } else {
            System.out.println("Невозможно добавить больше сотрудников.");
        }
    }

    public void addDormitory(String address, String name) {
        if (dormitoryCount < dormitories.length) {
            dormitories[dormitoryCount] = new Dormitory(address, name);
            dormitoryCount++;
            System.out.println("Общежитие добавлено в университет.");
        } else {
            System.out.println("Невозможно добавить больше общежитий.");
        }
    }

    public void displayStudents() {
        System.out.println("Список студентов в университете:");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
            System.out.println();
        }
    }

    public void displayEmployees() {
        System.out.println("Список сотрудников в университете:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayInfo();
            System.out.println();
        }
    }

    public void displayDormitories() {
        System.out.println("Список общежитий в университете:");
        for (int i = 0; i < dormitoryCount; i++) {
            dormitories[i].displayInfo();
            System.out.println();
        }
    }
}
