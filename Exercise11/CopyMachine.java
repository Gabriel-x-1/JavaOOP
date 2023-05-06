/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

public class CopyMachine extends OfficeAssistanceProduct {
  private static int VAT = 20;

  public CopyMachine(int code, long costPrice) {
      super(code, costPrice);
  }

  public static void setVAT(int vat) {
      VAT = vat;
  }

  @Override
  public long computeSellingPrice() {
      long commission = costPrice * OfficeAssistanceProduct.commissionPercent / 100;
      long vat = costPrice * VAT / 100;
      return costPrice + commission + vat;
  }
}
