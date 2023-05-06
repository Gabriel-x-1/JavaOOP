/**
 * 1211EA / HW8
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_8HW;

public class Circle extends Form {
    private int radius;
    private int x;
    private int y;
  
    // default constructor
    public Circle() {
      this.radius = 0;
      this.x = 0;
      this.y = 0;
    }
  
    // parameterized constructor
    public Circle(int r, int a, int b) {
      this.radius = r;
      this.x = a;
      this.y = b;
    }
  
    // setter method to set the radius of the circle
    public void setRadius(int r) {
      this.radius = r;
    }
  
    // method to return a string representation of the circle
    @Override
    public String toString() {
      return "Circle with radius " + radius + " and center at (" + x + ", " + y + ")";
    }
  
    // override the computeArea method to return the area of the circle
    @Override
    public double computeArea() {
      return Math.PI * radius * radius;
    }
  
    // override the computeVolume method to return 0 for a circle
    @Override
    public double computeVolume() {
      return 0;
    }
  }
  