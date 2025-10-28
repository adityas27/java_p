import java.util.Scanner;

class Student {
    int rollNo;
    double gpa;
    String name;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("GPA : " + gpa);
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getDetails();
        System.out.println("---");
        s1.displayDetails();
    }
}
