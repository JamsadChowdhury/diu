abstract class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " TK. Balance: " + balance + " TK");
    }
  
    public abstract void withdraw(double amount);
    public abstract void applyYearlyCharge();
}

interface LoanService {
    void showLoanLimit();
}

class SavingAccount extends Account implements LoanService {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double minBalanceRequired = balance * 0.02;
        if (balance - amount >= minBalanceRequired) {
            balance -= amount;
            System.out.println("Saving Withdrawn: " + amount + " TK. Balance: " + balance + " TK");
        } else {
            System.out.println("Denied! Must keep 2% balance (" + minBalanceRequired + " TK)");
        }
    }

    @Override
    public void applyYearlyCharge() {
        balance -= (balance * 0.05);
        System.out.println("5% Charge Applied. Saving Balance: " + balance + " TK");
    }

    @Override
    public void showLoanLimit() {
        System.out.println("Saving Loan Limit (50%): " + (balance * 0.50) + " TK");
    }
}

class CurrentAccount extends Account implements LoanService {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double minBalanceRequired = balance * 0.05;
        if (balance - amount >= minBalanceRequired) {
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount + " TK. Balance: " + balance + " TK");
        } else {
            System.out.println("Denied! Must keep 5% balance (" + minBalanceRequired + " TK)");
        }
    }

    @Override
    public void applyYearlyCharge() {
        balance -= (balance * 0.10);
        System.out.println("10% Charge Applied. Current Balance: " + balance + " TK");
    }

    @Override
    public void showLoanLimit() {
        System.out.println("Current Loan Limit (70%): " + (balance * 0.70) + " TK");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Saving Account Testing ---");
        SavingAccount sa = new SavingAccount(10000);
        sa.deposit(2000); 
        sa.withdraw(11900);
        sa.withdraw(5000);  
        sa.applyYearlyCharge(); 
        sa.showLoanLimit(); 

        System.out.println("\n--- Current Account Testing ---");
        CurrentAccount ca = new CurrentAccount(20000); 
        ca.withdraw(19500); 
        ca.withdraw(10000); 
        ca.applyYearlyCharge(); 
        ca.showLoanLimit();
    }
}
