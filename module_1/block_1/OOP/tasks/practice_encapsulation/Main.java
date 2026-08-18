public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Alice");

        account.deposit(1000);

        account.withdraw(300);

        System.out.println(account.getBalance());
    }
}