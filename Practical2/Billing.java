// Billing.java
public class Billing {

    // Method to compute bill for a single photo book
    public double computeBill(double price) {
        double tax = 0.08 * price;
        return price + tax;
    }

    // Method to compute bill for photo books with quantity
    public double computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double tax = 0.08 * subtotal;
        return subtotal + tax;
    }

    // Method to compute bill with quantity and coupon value
    public double computeBill(double price, int quantity, double couponValue) {
        double subtotal = price * quantity;
        double discountedTotal = subtotal - couponValue;
        double tax = 0.08 * discountedTotal;
        return discountedTotal + tax;
    }

    public static void main(String[] args) {
        Billing biller = new Billing();

        System.out.println("Testing computeBill() with one parameter (price):");
        double totalPrice1 = biller.computeBill(100.00);
        System.out.println("Total due for one book (Rs. 100): Rs. " + String.format("%.2f", totalPrice1));

        System.out.println("\nTesting computeBill() with two parameters (price, quantity):");
        double totalPrice2 = biller.computeBill(50.00, 3);
        System.out.println("Total due for 3 books (Rs. 50 each): Rs. " + String.format("%.2f", totalPrice2));

        System.out.println("\nTesting computeBill() with three parameters (price, quantity, coupon):");
        double totalPrice3 = biller.computeBill(75.00, 2, 10.00);
        System.out.println("Total due for 2 books (Rs. 75 each) with Rs. 10 coupon: Rs. " + String.format("%.2f", totalPrice3));
    }
}