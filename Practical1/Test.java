import java.util.Scanner;

class Student {
    int rollNo;
    double percent;
    String name;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Percentage: ");
        percent = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Percent : " + percent + "%");
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student Object created");
        s1.getDetails();
        System.out.println("Input details taken");
        s1.displayDetails();
        System.out.println("Student class output displayed");
    }
}
