class Customer {
    String name;
    String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayCustomer() {
        System.out.println("Customer Name : " + name);
        System.out.println("Address       : " + address);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    void showSavings() {
        System.out.println("\n--- Savings Account ---");
        displayBalance();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class InvestmentAccount extends Account {
    String ticker;
    int quantity;
    double stockPrice;
    double commission;

    InvestmentAccount(double balance, String ticker, int quantity,
                      double stockPrice, double commission) {
        super(balance);
        this.ticker = ticker;
        this.quantity = quantity;
        this.stockPrice = stockPrice;
        this.commission = commission;
    }

    void showInvestment() {
        System.out.println("\n--- Investment Account ---");
        displayBalance();
        System.out.println("Ticker      : " + ticker);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Stock Price : " + stockPrice);
        System.out.println("Commission  : " + commission);

        double total = quantity * stockPrice + commission;
        System.out.println("Total Cost  : " + total);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jamsad Chowdhury", "Dhaka");
        customer.displayCustomer();

        SavingsAccount savings = new SavingsAccount(50000, 6.5);
        savings.showSavings();

        InvestmentAccount investment =
                new InvestmentAccount(100000, "AAPL", 10, 200, 50);

        investment.showInvestment();
    }
}
