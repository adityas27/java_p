class Student {
    int idNumber;
    int creditHoursEarned;
    int pointsEarned;
    double gradePointAverage;

    Student() {
        idNumber = 9999;
        creditHoursEarned = 3;
        pointsEarned = 12;
        computeGpa();
    }

    Student(Student other) {
        idNumber = other.idNumber;
        creditHoursEarned = other.creditHoursEarned;
        pointsEarned = other.pointsEarned;
        gradePointAverage = other.gradePointAverage;
    }

    void computeGpa() {
        if (creditHoursEarned > 0) {
            gradePointAverage = (double) pointsEarned / creditHoursEarned;
        } else {
            gradePointAverage = 0.0;
        }
    }

    void setIdNumber(int id) {
        idNumber = id;
    }

    void setCreditHoursEarned(int hours) {
        creditHoursEarned = hours;
        computeGpa();
    }

    void setPointsEarned(int points) {
        pointsEarned = points;
        computeGpa();
    }

    int getIdNumber() {
        return idNumber;
    }

    int getCreditHoursEarned() {
        return creditHoursEarned;
    }

    int getPointsEarned() {
        return pointsEarned;
    }

    double getGradePointAverage() {
        return gradePointAverage;
    }

    void display() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit H   ours: " + creditHoursEarned);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Grade Point Average: " + String.format("%.1f", gradePointAverage));
    }
}