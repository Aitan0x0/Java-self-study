package BankTask;

public class Main {
   static void main(String[] args) {
        BankAccount account1 = new BankAccount("AAYTENNNN", 20.00);
        account1.deposit(12);
        account1.getBalance();
        account1.withdraw(12);
        account1.withdraw(100);
    }
}
