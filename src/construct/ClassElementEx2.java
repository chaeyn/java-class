package construct;

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account account = new Account(0);
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.getBalance());;
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else  {
            this.balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}