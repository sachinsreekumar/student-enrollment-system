package enrollmentpackage;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String enrollmentId;

    public Student(String name, int age, String enrollmentId) {
        this.name = name;
        this.age = age;
        this.enrollmentId = enrollmentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }
}

public class StudentEnrollmentSystem {
    private ArrayList<Student> students;

    public StudentEnrollmentSystem() {
        students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student enrolled successfully.");
    }

    public void displayEnrolledStudents() {
        if (students.isEmpty()) {
            System.out.println("No students are currently enrolled.");
        } else {
            System.out.println("Enrolled students:");
            for (Student student : students) {
                System.out.println("- " + student.getName() + " (age " + student.getAge() + ") - enrollment ID: " + student.getEnrollmentId());
            }
        }
    }

    public static void main(String[] args) {
        StudentEnrollmentSystem enrollmentSystem = new StudentEnrollmentSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enroll a student");
            System.out.println("2. Display enrolled students");
            System.out.println("3. Exit");
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                System.out.print("Enter enrollment ID: ");
                String enrollmentId = scanner.next();
                Student student = new Student(name, age, enrollmentId);
                enrollmentSystem.enrollStudent(student);
            } else if (choice == 2) {
                enrollmentSystem.displayEnrolledStudents();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}




