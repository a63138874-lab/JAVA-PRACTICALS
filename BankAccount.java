class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int number, String name, double bal) {
        accountNumber = number;
        accountHolderName = name;
        balance = bal;
    }

    // Method to display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12345, "Ashwini", 10000);

        b1.display();
        b1.deposit(5000);
    }
}