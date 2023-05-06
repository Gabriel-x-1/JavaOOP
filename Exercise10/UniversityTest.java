/**
 * 1211EA / HW10
 * @author  Bilciurescu Gabriel Cosmin 
 * @version 27.12.2022
 */
package Lab_10HW;

import java.util.Calendar;

public class UniversityTest {
    public static void main(String[] args) {
 
      University university = new University("My University", "My City");

      Author author1 = new Author("Author 1");
      Author author2 = new Author("Author 2");
      

      university.addAuthor(author1);
      university.addAuthor(author2);
      
   
      Journal journal1 = new Journal("Journal 1", Calendar.getInstance(), 2, "Journal A", 3.5);
      Journal journal2 = new Journal("Journal 2", Calendar.getInstance(), 2, "Journal B", 2.5);
      ConferenceProceeding conference1 = new ConferenceProceeding("Conference 1", Calendar.getInstance(), 2, "Volume A", true);
      ConferenceProceeding conference2 = new ConferenceProceeding("Conference 2", Calendar.getInstance(), 2, "Volume B", false);
      author1.addPublication(journal1);
      author1.addPublication(journal2);
      author1.addPublication(conference1);
      author1.addPublication(conference2);
      Journal journal3 = new Journal("Journal 3", Calendar.getInstance(), 2, "Journal C", 4.5);
      Journal journal4 = new Journal("Journal 4", Calendar.getInstance(), 2, "Journal D", 3.5);
      ConferenceProceeding conference3 = new ConferenceProceeding("Conference 3", Calendar.getInstance(), 2, "Volume C", true);
      ConferenceProceeding conference4 = new ConferenceProceeding("Conference 4", Calendar.getInstance(), 2, "Volume D", false);
      author2.addPublication(journal3);
      author2.addPublication(journal4);
      author2.addPublication(conference3);
      author2.addPublication(conference4);
      

      double author1Score = author1.computeScore();
      double author2Score = author2.computeScore();
      double universityScore = university.computeScore();
      

      System.out.println("Author 1 score: " + author1Score);
      System.out.println("Author 2 score: " + author2Score);
      System.out.println("University score: " + universityScore);
    }
  }
  