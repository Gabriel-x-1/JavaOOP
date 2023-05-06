/**
 * 1211EA / HW8
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_8HW;

public class FormTest {
    public static void main(String[] args) {
        
      Form[] forms = new Form[3];
      forms[0] = new Point(1, 2);
      forms[1] = new Circle(3, 4, 5);
      forms[2] = new Cylinder(6, 7, 8, 9);
  
      for (Form form : forms) {
        System.out.println("Form Information:");
        System.out.println(form.toString());
        System.out.println("Area: " + form.computeArea());
        System.out.println("Volume: " + form.computeVolume());
        System.out.println();
      }
    }
  }
  
