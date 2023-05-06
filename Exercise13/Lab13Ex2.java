/**
 * 1211EA / Lab13
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 28/01/2023
 */
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Lab13Ex2 {
    public static void main(String[] args) throws IOException{
        int x=0;
        String[] words = new String[900];
        File file = new File("Lab13_basicWordsinEnglish.txt");
		Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
			words[x]=scan.nextLine();
			x++;
		}
        scan.close();
        Random rand = new Random();
        FileWriter writer = new FileWriter("Lab13_Shakespeare.txt");
        for(int i=0; i<10000;i++){
            int j = rand.nextInt(0,849);
            writer.write(words[j]+" ");
        }
        writer.close();
    }    
}
