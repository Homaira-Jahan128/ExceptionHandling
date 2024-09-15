//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 100.0);

        try {
            account.deposit(50.0);
            account.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(50);
            account.deposit(-10);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("End of transaction");
        }
    }
}