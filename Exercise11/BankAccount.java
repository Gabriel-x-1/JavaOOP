/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

public abstract class BankAccount {
    protected double balance;
    protected String owner;
    protected int id;
    protected static int idCurrentAccount = 1;

    public BankAccount(String owner, double interestRate) {
        this.owner = owner;
        this.id = idCurrentAccount++;
    }

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.id = idCurrentAccount++;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account type: " + this.getClass().getName() + 
               "\nOwner: " + owner + 
               "\nBalance: " + balance + 
               "\nID: " + id;
    }

    public abstract void endOfMonth();
}
