/**
 * 1211EA / Lab 11
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_11;

public abstract class OfficeAssistanceProduct {
  private static int commissionPercent = 10;
  private int code;
  private long costPrice;

  public OfficeAssistanceProduct(int code, long costPrice) {
      this.code = code;
      this.costPrice = costPrice;
  }

  public static void setCommision(int percent) {
      commissionPercent = percent;
  }

  public abstract long computeSellingPrice();

  @Override
  public String toString() {
      return "Code: " + code + ", Cost price: $" + costPrice + ", Selling price: $" + computeSellingPrice();
  }
}

  