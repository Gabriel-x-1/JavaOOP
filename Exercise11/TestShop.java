/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

import java.util.ArrayList;

public class TestShop {
    public static void main(String[] args) {
        ArrayList<OfficeAssistanceProduct> products = new ArrayList<>();
        products.add(new Printer(1, 100));
        products.add(new CopyMachine(2, 200));
        products.add(new Computer(3, 300));

        for (OfficeAssistanceProduct product : products) {
            System.out.println(product);
        }
    }
}
