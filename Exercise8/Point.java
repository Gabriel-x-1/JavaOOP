/**
 * 1211EA / HW8
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_8HW;

public class Point extends Form {
    private int x;
    private int y;
  
    // default constructor
    public Point() {
      this.x = 0;
      this.y = 0;
    }
  
    // parameterized constructor
    public Point(int a, int b) {
      this.x = a;
      this.y = b;
    }
  
    // setter method to set the x and y coordinates of the point
    public void setPoint(int a, int b) {
      this.x = a;
      this.y = b;
    }
  
    // method to return a string representation of the point
    @Override
    public String toString() {
      return "Point with coordinates: (" + x + ", " + y + ")";
    }
  
    // override the computeArea method to return 0 for a point
    @Override
    public double computeArea() {
      return 0;
    }
  
    // override the computeVolume method to return 0 for a point
    @Override
    public double computeVolume() {
      return 0;
    }
  }
  