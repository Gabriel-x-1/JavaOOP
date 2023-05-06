/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

import java.util.Calendar;

public class TestAccount {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        SavingsAccount savings1 = new SavingsAccount("John", 0.01);
        SavingsAccount savings2 = new SavingsAccount("Jane", 0.01);
        CurrentAccount current1 = new CurrentAccount("Bob", 1000, 3, 1);
        CurrentAccount current2 = new CurrentAccount("Alice", 500, 3, 1);

        // Print all relevant information in the four accounts
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println(current1);
        System.out.println(current2);

        // Execute some transactions, printing the current balance after each transaction
        savings1.deposit(100);
        System.out.println("Savings1 balance after deposit: " + savings1.getBalance());
        current2.withdraw(50);
        System.out.println("Current2 balance after withdraw: " + current2.getBalance());

        // Call the method endOfMonth()
        if (currentDay == lastDayOfMonth) {
            savings1.endOfMonth();
            savings2.endOfMonth();
            current1.endOfMonth();
            current2.endOfMonth();
        }

        // Print once again all relevant information in the four accounts
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println(current1);
        System.out.println(current2);
    }
}
