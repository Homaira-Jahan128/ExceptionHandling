public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException{
        System.out.println("Attempting to deposit: " + amount + "$");
        if(amount <= 0){
            throw new InvalidAmountException("Invalid Amount.");
        }
        //System.out.println("Depositing: " + amount + "$");
        balance = balance + amount;
        System.out.println("New balance: " + balance + "$");

    }

    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw : " + amount + "$");
        if(amount > balance || amount <= 0){
            throw new InsufficientFundsException("Insufficient funds!");
        }
        balance = balance - amount;
        System.out.println("New balance: " + balance + "$");

    }

    public double getBalance() {
        return balance;
    }
}
