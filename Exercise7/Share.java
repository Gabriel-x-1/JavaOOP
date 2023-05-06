/**
 * 1211EA / HW7
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
public class Share {
    private double price;
    private Company company;
  
    public Share(double price, Company company) {
      this.price = price;
      this.company = company;
    }
  
    public double getPrice() {
      return price;
    }
  
    public Company getCompany() {
      return company;
    }
  }