/**
 * 1211EA / Lab 9
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_9;

public class Video {
    // Member variables
    private String title;
    private int length;
    private boolean available;

    // Constructors
    public Video(String title) {
        this.title = title;
        this.length = 90;
        this.available = true;
    }

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    // Method to display information about the video object
    public void show() {
        System.out.println("Title: " + this.title);
        System.out.println("Length: " + this.length);
        System.out.println("Availability: " + this.available);
    }
}
