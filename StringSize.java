import java.util.Scanner;

public class StringSize {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      double stringSize;

      userInput = scnr.nextLine();

      stringSize = userInput.length();

      System.out.println("Size of userInput: " + stringSize);

      if (stringSize % 2 == 0) {
      System.out.println("even");
      }
      else if (stringSize % 2 != 0) {
      System.out.println("odd");
      }
      return;
   }
}