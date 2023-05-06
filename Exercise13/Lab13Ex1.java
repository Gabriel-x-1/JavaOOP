/**
 * 1211EA / Lab13
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 28/01/2023
 */
import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;

public class Lab13Ex1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Lab13_test.txt");
        Scanner scan = new Scanner(file);
        String[] array = new String[100];
        int n = 0;

        while (scan.hasNextLine()) {
            array[n] = scan.nextLine();
            StringTokenizer make = new StringTokenizer(array[n], " , ! ; ");
            String a = "";
            while (make.hasMoreTokens()) {
                a = a.concat(make.nextToken() + " ");
            }
            array[n] = a;
            n++;
        }

        String[] word = new String[10000];
        int[] count = new int[10000];
        int x = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(array[i], " , ! ; ");
            while (st.hasMoreTokens()) {
                word[x] = st.nextToken();
                word[x].trim();
                count[x] = 0;
                for (int j = 0; j < n; j++) {
                    StringTokenizer st1 = new StringTokenizer(array[j], " , ! ; ");
                    while (st1.hasMoreTokens()) {
                        if (word[x].equalsIgnoreCase(st1.nextToken().trim())) {
                            count[x] = count[x] + 1;
                        }
                    }
                }
                for (int j = 0; j < n; j++)
                    array[j].replace(word[x], "");
                x++;
            }
        }
        // Sorting
        boolean sorted = false;
        do {
            sorted = true;
            for (int i = 0; i < x - 1; i++) {
                for(int j = i;j<x;j++)
                {
                    int aux;
                String aux1;
                // to compare one string with other strings
                if (word[i].compareToIgnoreCase(word[j]) > 0) {
                    sorted = false;
                    // swapping strings
                    aux1 = word[i];
                    word[i] = word[j];
                    word[j] = aux1;
                    // swapping ints
                    aux = count[i];
                    count[i] = count[j];
                    count[j] = aux;
                }
                }

            }
        } while (sorted == false);

        FileWriter writer = new FileWriter("Lab13_test_new.txt");
        for (int i = 0; i < x; i++) {
            writer.write(word[i] + " " + count[i] + "\n");
        }
        scan.close();
        writer.close();
    }
}
