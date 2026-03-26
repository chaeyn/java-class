package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 2000);
        balance = withdrawal(balance, 3000);
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdrawal(int balance, int amount) {
        balance -= amount;

        if (balance < 0) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance += amount;
        }

        System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance + "원");

        return balance;
    }
}
