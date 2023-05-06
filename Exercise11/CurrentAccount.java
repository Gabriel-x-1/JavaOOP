/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

public class CurrentAccount extends BankAccount {
    private int transactionNo;
    private final int FREE_TRANSACTIONS ;
    private final double TRANSACTION_COST;

    public CurrentAccount(String owner, double balance, int transNr, int transCost) {
        super(balance, owner);
        this.transactionNo = transNr;
        this.FREE_TRANSACTIONS = transNr;
        this.TRANSACTION_COST = transCost;
    }

    private void dischargeExpenses() {
        if (transactionNo > FREE_TRANSACTIONS) {
            balance -= (transactionNo - FREE_TRANSACTIONS) * TRANSACTION_COST;
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nFree transactions: " + FREE_TRANSACTIONS + 
               "\nTransaction cost: " + TRANSACTION_COST + 
               "\nTransaction number: " + transactionNo;
    }

    @Override
    public void endOfMonth() {
        dischargeExpenses();
    }

    public void deposit(double sum) {
        transactionNo++;
        super.deposit(sum);
    }

    public void withdraw(double sum) {
        transactionNo++;
        super.withdraw(sum);
    }
}
