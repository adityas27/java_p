import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public void assignValues(String name, String accNo, String type, double initialBalance) {
        depositorName = name;
        accountNumber = accNo;
        accountType = type;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Depositor name : " + depositorName);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Account type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter depositor name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter account type: ");
        String type = scanner.nextLine();

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble();

        account.assignValues(name, accNo, type, initialBalance);
        account.deposit(2000);
        account.withdraw(1000);
        account.display();

        scanner.close();
    }
}
