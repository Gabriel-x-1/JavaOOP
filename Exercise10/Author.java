/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.ArrayList;

public  class Author {
    private String name;
    private ArrayList<Publication> publications;
  
    public Author(String name) {
      this.name = name;
      this.publications = new ArrayList<>();
    }
  
    public void addPublication(Publication p) {
      this.publications.add(p);
    }
  
    public double computeScore() {
      double score = 0;
      for (Publication p : this.publications) {
        score += p.computeScore();
      }
      return score;
    }
  }