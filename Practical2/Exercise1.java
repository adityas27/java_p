
public class Student {
    private int idNumber;
    private int creditHoursEarned;
    private int pointsEarned;
    private double gradePointAverage;

    public Student() {
        this.idNumber = 9999;
        this.pointsEarned = 12;
        this.creditHoursEarned = 3;
        computeGradePointAverage();
    }
    
    public Student(int idNumber, int creditHoursEarned, int pointsEarned) {
        this.idNumber = idNumber;
        this.creditHoursEarned = creditHoursEarned;
        this.pointsEarned = pointsEarned;
        computeGradePointAverage();
    }
    
    public Student(Student other) {
        this.idNumber = other.idNumber;
        this.creditHoursEarned = other.creditHoursEarned;
        this.pointsEarned = other.pointsEarned;
        this.gradePointAverage = other.gradePointAverage;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
        computeGradePointAverage();
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
        computeGradePointAverage();
    }

    // Method to compute GPA
    private void computeGradePointAverage() {
        if (creditHoursEarned > 0) {
            this.gradePointAverage = (double) pointsEarned / creditHoursEarned;
        } else {
            this.gradePointAverage = 0.0;
        }
    }

    // Methods to display values
    public void displayStudentDetails() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit Hours Earned: " + creditHoursEarned);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Grade Point Average: " + String.format("%.2f", gradePointAverage));
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Default Constructor:");
        Student s1 = new Student();
        s1.displayStudentDetails();

        System.out.println("\nDemonstrating Parameterized Constructor:");
        Student s2 = new Student(1234, 60, 240);
        s2.displayStudentDetails(); 

        System.out.println("\nDemonstrating Copy Constructor:");
        Student s3 = new Student(s2);
        s3.displayStudentDetails();

        s2.setCreditHoursEarned(70);
        s2.setPointsEarned(210);

        System.out.println("\nAfter modifying s2:");
        System.out.println("Details of s2:");
        s2.displayStudentDetails();
        System.out.println("Details of s3 (copy):");
        s3.displayStudentDetails();
    }
}