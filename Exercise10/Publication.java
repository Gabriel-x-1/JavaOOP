/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.Calendar;

public abstract class Publication {
    private String name;
    private Calendar apparition;
    private int numberOfAuthors;
  
    public Publication(String name, Calendar apparition, int numberOfAuthors) {
      this.name = name;
      this.apparition = apparition;
      this.numberOfAuthors = numberOfAuthors;
    }
  
    public abstract double computeScore();
  }
