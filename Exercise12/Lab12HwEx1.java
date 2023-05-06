/**
 * 1211EA / Lab13
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 28/01/2023
 */
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;

public class Lab12HwEx1 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<String>();
        File file = new File("Lab12_zip.txt");
        Scanner scan = new Scanner(file);
        int i = 1;
        int entries = 0;
        while (scan.hasNextLine()) {
            //// i need fields 1 2 3 4 - 6 7 - - 10
            String s = scan.nextLine();
            String a = "";
            String b = "";
            StringTokenizer st = new StringTokenizer(s, ",");
            int j = 1;
            ///
            while (st.hasMoreTokens()) {
                if (j != 5 && j != 8 && j != 9) {
                    a = st.nextToken();
                    a = a.trim();
                    b = b.concat(a + " ");

                } else
                    a = a.concat(st.nextToken());
                j++;
            }
            list.add(b);
            entries += 7;
            i++;
        }
        scan.close();

        System.out.println("There are " + entries + " total entries.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a Town: ");
        String town = input.nextLine();
        System.out.println("Enter the name of a State: ");
        String state = input.nextLine();
        input.close();
        System.out.println();
        System.out.println("Query: " + town + ", " + state);
        String a;
        boolean exists = false;
        for (int j = 0; j < i - 1; j++) {
            a = list.get(j);
            StringTokenizer st = new StringTokenizer(a);
            String[] array = new String[10];
            int k = 0;
            while (st.hasMoreTokens()) {
                array[k] = st.nextToken();
                k++;
            }
            if (array[1].equalsIgnoreCase(town) && array[2].equalsIgnoreCase(state)) {
                exists = true;
                System.out.println("Found...");
                System.out.println("Town: " + array[1] + ", " + array[2] + ", " + array[0] + " (Area Code: " + array[3]
                        + ", Time Zone: " + array[5] + ")");
                System.out.println("County: " + array[4] + ", population " + array[6]);
                break;
            }
        }
        if (exists == false)
            System.out.println("Not Found...");

    }
}