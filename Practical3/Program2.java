public class Program2 {
    public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
        int result = a / b; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Exception caught: " + e);
    }
        System.out.println("Program continues");
    }
}