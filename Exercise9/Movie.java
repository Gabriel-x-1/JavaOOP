/**
 * 1211EA / Lab 9
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_9;

public class Movie extends Video {
    // Additional member variables for Movie class
    private String director;
    private int rating;

    // Constructor for Movie class
    public Movie(String title, int length, String director, int rating) {
        super(title, length);
        this.director = director;
        this.rating = rating;
    }

    // Method to display information about the movie object
    @Override
    public void show() {
        super.show();
        System.out.println("Director: " + this.director);
        System.out.println("Rating: " + this.rating);
    }
}
