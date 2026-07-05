class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interest;

    SavingsAccount(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    void showInterest() {
        System.out.println("Interest Rate: " + interest + "%");
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(50000, 6.5);

        s.showBalance();
        s.showInterest();

    }
}
