/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.ArrayList;


public class University {
  private String name;
  private String location;
  private ArrayList<Author> authors;
  
  public University(String name, String location) {
    this.name = name;
    this.location = location;
    this.authors = new ArrayList<>();
  }
  
  public void addAuthor(Author a) {
    this.authors.add(a);
  }
  
  public double computeScore() {
    double score = 0;
    for (Author a : this.authors) {
      score += a.computeScore();
    }
    return score;
  }

}