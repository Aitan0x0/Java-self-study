package BankTask;

public class BankAccount {
    private String accountNumber;
    private double balance;


    //constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException{
        if (amount <= 0) {
            throw new InvalidAmountException("Elave edilecek mebleg menfi ve ya sifir ola bilmez");
        }
        balance += amount;
        System.out.println(amount + " AZN hesaba elave olundu. Cari balans: " + balance);

    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Cixarilacaq mebleg sifir ve ya menfi eded ola bilmez");
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("Balansda kifayet qeder mebleg yoxdur");
        }
        balance -= amount;
        System.out.println(amount + " AZN hesabdam cixarildi. Cari balans: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}