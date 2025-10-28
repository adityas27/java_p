import java.util.Scanner;

public class Exercise1 {
    static class Student {
        private String idNumber;
        private int numberOfHours;
        private int numberOfPoints;
        private double gpa;

        public void assignValues(String id, int hours, int points) {
            idNumber = id;
            numberOfHours = hours;
            numberOfPoints = points;
            computeGPA();
        }

        public void computeGPA() {
            if (numberOfHours != 0) {
                gpa = numberOfHours / numberOfPoints;
            } else {
                gpa = 0.0;
            }
        }

        public void display() {
            System.out.println("\n--- Student Information ---");
            System.out.println("ID Number       : " + idNumber);
            System.out.println("Credit Hours    : " + numberOfHours);
            System.out.println("Points Earned   : " + numberOfPoints);
            System.out.println("Grade Point Avg : " + gpa);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter number of credit hours earned: ");
        int hours = scanner.nextInt();

        System.out.print("Enter number of points earned: ");
        int points = scanner.nextInt();

        student.assignValues(id, hours, points);
        student.display();

        scanner.close();
    }
}
