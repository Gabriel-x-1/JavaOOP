/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.Calendar;


public  class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;
    private int numberOfAuthors;
  
    public ConferenceProceeding(String name, Calendar apparition, int numberOfAuthors, String volumeName, boolean indexed) {
      super(name, apparition, numberOfAuthors);
      this.volumeName = volumeName;
      this.indexed = indexed;
      this.numberOfAuthors=numberOfAuthors;
    }
  
    @Override
    public double computeScore() {
      if (this.indexed) {
        return 0.25 / this.numberOfAuthors;
      } else {
        return 0.2 / this.numberOfAuthors;
      }
    }
  }