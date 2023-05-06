/**
 * 1211EA / Lab 9
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_9;

public class MovieTest {
    public static void main(String[] args) {
        // Create a video and a movie object
        Video video = new Video("Pulp Fiction", 154);
        Movie movie = new Movie("The Dark Knight", 152, "Christopher Nolan", 9);

        // Display information about the objects
        video.show();
        movie.show();
    }
}
