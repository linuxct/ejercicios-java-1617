package utilidades;
import java.io.*;

/**
 * ConsoleReadingDemo.java (UTF-8)
 *
 * 28-nov-2016
 * @author linuxct
 */

/*
The sample shows how you can reading characters from console in java
*/

public class ConsoleReadingDemo {
  public static void main(String[] args) {
    String newLine = System.getProperty("line.separator");
    System.out.println("Reading characters from console");
    
      //You use System.in to get the characters entered in console by user
      try
      {
      //You need to create BufferedReader which has System.in to get user input
      BufferedReader br = new BufferedReader(new
                              InputStreamReader(System.in));
      char userInput;
      System.out.println("Enter characters...");
      System.out.println("Enter 'q' to quit.");
        do {
          //reader .read() would wait for the user to enter character.
          //keep and entering characters and when you press enter, all those would be displayed
          //so it is keeping it in buffer untill the user types 'q' and presses enter
          userInput = (char) br.read();
          System.out.println("You entered : " + userInput);
        } while(userInput != 13);
      }
      catch(Exception e)
      {
      }
  }
}


