/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.Calendar;

public class Journal extends Publication {
    private String journalName;
    private double impactFactor;
    private int numberOfAuthors;

  
    public Journal(String name, Calendar apparition, int numberOfAuthors, String journalName, double impactFactor) {
      super(name, apparition, numberOfAuthors);
      this.journalName = journalName;
      this.impactFactor = impactFactor;
      this.numberOfAuthors=numberOfAuthors;
    }
  
    @Override
    public  double computeScore() {
      return (this.impactFactor * 0.5) / this.numberOfAuthors;
    }
  }