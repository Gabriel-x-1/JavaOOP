/**
 * 1211EA / HW7
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
import java.util.ArrayList;
import java.util.List;
public class Portfolio {
  private List<Share> shares;

  public Portfolio() {
    shares = new ArrayList<>();
  }

  public void addShare(Share share) {
    shares.add(share);
  }

  public double computeSum() {
    double sum = 0;
    for (Share share : shares) {
      sum += share.getPrice();
    }
    return sum;
  }
}