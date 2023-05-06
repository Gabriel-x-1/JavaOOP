/**
 * 1211EA / Lab 9
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_9;

public class VideoTest {
    public static void main(String[] args) {
      
        Video video1 = new Video("The Shawshank Redemption");
        Video video2 = new Video("The Godfather", 175);

        
        video1.show();
        video2.show();
    }
}
