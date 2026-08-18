public class BankAccount {

    private double balance;
    private final String owner;

    BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else throw new IllegalArgumentException("Баланс не может быть отрицательным");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else throw new IllegalArgumentException("Нельзя снять отрицательную сумма или выше вашего баланса");
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

}