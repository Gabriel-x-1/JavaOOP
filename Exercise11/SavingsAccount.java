/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, double interestRate) {
        super(owner, interestRate);
        this.interestRate = interestRate;
    }

    public SavingsAccount(double balance, String owner, double interestRate) {
        super(balance, owner);
        this.interestRate = interestRate;
    }

    private void applyInterest() {
        balance += balance * interestRate;
    }

    public double getInterest() {
        return interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterest rate: " + interestRate;
    }

    @Override
    public void endOfMonth() {
        applyInterest();
    }
}
