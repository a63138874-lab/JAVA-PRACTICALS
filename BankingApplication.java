class Bank {
    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}
class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 8.4%");
    }
}
class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7.3%");
    }
}
class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate: 7.5%");
    }
}

public class BankingApplication {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.interestRate();
        b2.interestRate();
        b3.interestRate();
    }
}