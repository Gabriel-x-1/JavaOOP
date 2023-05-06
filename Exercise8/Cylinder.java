/**
 * 1211EA / HW8
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_8HW;

public class Cylinder extends Form {
    private int height;
    private int radius;
    private int x;
    private int y;
  
    // default constructor
    public Cylinder() {
      this.height = 0;
      this.radius = 0;
      this.x = 0;
      this.y = 0;
    }
  
    // parameterized constructor
    public Cylinder(int h, int r, int a, int b) {
      this.height = h;
      this.radius = r;
      this.x = a;
      this.y = b;
    }
  
    // setter method to set the height of the cylinder
    public void setHeight(int h) {
      this.height = h;
    }
  
    // method to return a string representation of the cylinder
    @Override
    public String toString() {
      return "Cylinder with height " + height + ", radius " + radius + " and center at (" + x + ", " + y + ")";
    }
  
    // override the computeArea method to return the surface area of the cylinder
    @Override
    public double computeArea() {
      return 2 * Math.PI * radius * (radius + height);
    }
  
    // override the computeVolume method to return the volume of the cylinder
    @Override
    public double computeVolume() {
      return Math.PI * radius * radius * height;
    }
  }
  