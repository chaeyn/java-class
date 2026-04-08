package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1300);
        account.withdraw(100);
        System.out.println("balance = " + account.getBalance());
    }
}
