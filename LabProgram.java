import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         int  numElements = scnr.nextInt();
         int[] userList = new int[numElements];   // List of numElement integers specified by the user  
         int userInput;         // Number of elements in the list   
         int i;              
         // Add more variables as needed
    

         for (i = 0; i < userList.length; ++i) {
            userInput = scnr.nextInt();
            userList[i] = userInput;
         }
  
         for (i = userList.length -1; i >= 0; --i) {
            System.out.print(userList[i] + ",");
            if (i == 0) {
               System.out.print("\n");
            }
            }
            scnr.close();
      }
      }
   }

