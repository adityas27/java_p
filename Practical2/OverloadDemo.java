// Method overloading
class OverloadDemo {
    // Area of a square
    void area(int side) {
        System.out.println(side * side);
    }

    // Area of rectangle
    int area(int l, int b) {
        return (l * b);
    }

    double area(int l, double b) {
        return (l * b);
    }

    double area(double l, int b) {
        return (l * b);
    }

    // Area of triangle by Heron's formula
    double area(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public static void main(String a[]) {
        OverloadDemo d = new OverloadDemo();
        d.area(3);
        int x = d.area(3, 4);
        System.out.println("Area is" + x);
        System.out.println("Area is" + d.area(3, 4, 5));
        System.out.println("Area is" + d.area(2, 3.5));
        System.out.println("Area is" + d.area(2.5, 3));
    }
}