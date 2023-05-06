
public class Sentence {
    public static void main(String [] args)
    {
        String name = "Bilciurescu Gabriel";
        String date= "12/09/2003";
        String time [ ]= date.split("/");
        String year = null;
        year = time [2];
        String day=time[0];
        String month =time[1];
        String sentence = "Hello "+name+"! You were born in "+year+". ";
        System.out.println(sentence);
    }
}
