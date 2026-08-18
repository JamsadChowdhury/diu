interface DepositCapable {
    void deposit(double amount);
}

interface WithdrawCapable {
    void withdraw(double amount);
}

abstract class Account implements DepositCapable, WithdrawCapable {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public abstract double calculateYearlyCharge();
    public abstract double calculateMaxLoan();
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Savings] Deposited: $" + amount + " | New Balance: $" + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
      
        double minRequiredBalance = balance * 0.02;
        if (balance - amount >= minRequiredBalance) {
            balance -= amount;
            System.out.println("[Savings] Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("[Savings] Withdrawal Denied! Minimum 2% balance ($" + minRequiredBalance + ") must remain.");
        }
    }

    @Override
    public double calculateYearlyCharge() {
        return balance * 0.05;
    }

    @Override
    public double calculateMaxLoan() {
        return balance * 0.50;
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Current] Deposited: $" + amount + " | New Balance: $" + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        
        double minRequiredBalance = balance * 0.05;
        if (balance - amount >= minRequiredBalance) {
            balance -= amount;
            System.out.println("[Current] Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("[Current] Withdrawal Denied! Minimum 5% balance ($" + minRequiredBalance + ") must remain.");
        }
    }

    @Override
    public double calculateYearlyCharge() {
        return balance * 0.10;
    }

    @Override
    public double calculateMaxLoan() {
        return balance * 0.70;
    }
}

public class ABBankSystem {
    public static void main(String[] args) {
        
        Account savings = new SavingsAccount("SA-101", 10000.0);
        Account current = new CurrentAccount("CA-201", 20000.0);

        System.out.println("--- AB BANK ACCOUNT OPERATIONS ---\n");

        System.out.println("Savings Account (" + savings.getAccountNumber() + ") Initial Balance: $" + savings.getBalance());
        System.out.println("Yearly Charge (5%): $" + savings.calculateYearlyCharge());
        System.out.println("Max Loan Available (50%): $" + savings.calculateMaxLoan());
        savings.deposit(2000);
        savings.withdraw(11000);
        savings.withdraw(1000);
        
        System.out.println("\n-----------------------------------\n");

        System.out.println("Current Account (" + current.getAccountNumber() + ") Initial Balance: $" + current.getBalance());
        System.out.println("Yearly Charge (10%): $" + current.calculateYearlyCharge());
        System.out.println("Max Loan Available (70%): $" + current.calculateMaxLoan());
        current.deposit(5000);
        current.withdraw(23000);
        current.withdraw(1500);
    }
}
