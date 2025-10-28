class Person {
    String name;
    int id;
    int shit;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Person constructor called.");
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Employee extends Person {
    double salary;
    Employee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
        System.out.println("Employee constructor called.");
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
    }
}
public class Program1{
    public static void main(String argv[]){
        System.out.println("Works!");
        Employee e1 = new Employee("Ravi", 101, 10000.00);
        e1.displayDetails();
    }
}