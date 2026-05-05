import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                viewStudents();
            } else {
                break;
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        students.add(new Student(name, id));
        System.out.println("Student added.");
    }

    static void viewStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
