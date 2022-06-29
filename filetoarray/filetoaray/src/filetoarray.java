package filetoarray;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class filetoarray {
	public static void main(String[] args) throws IOException {
	      FileInputStream fileByteStream = null; 
	      Scanner inFS = null;                  
	      String fileString = null;
	      int stringSize;
	      FileOutputStream fileStream = null;	 
	      PrintWriter outFS = null;	

	      System.out.println("Opening input file input.in.");
	      fileByteStream = new FileInputStream("src/input.in");
	      inFS = new Scanner(fileByteStream);
	      
	      System.out.println("Opening output file results.out.");
	      fileStream = new FileOutputStream("src/results.out");
	      outFS = new PrintWriter(fileStream);

	      System.out.println("Reading and printing numbers.");
	      
	      while (inFS.hasNextLine()) {

	      
	      int totalRow = 8;
	      int totalColumn = 8;
	      char[][] myArray = new char[totalRow][totalColumn];
	  
	      for (int row = 0; inFS.hasNext() && row < totalRow; row++) {
	          char[] chars = inFS.next().toCharArray();
	          for (int i = 0; i < totalColumn && i < chars.length; i++) {
	              myArray[row][i] = chars[i];
	          }
	      }
	      
	      for (int i = 0; i < myArray.length; i++) { //this equals to the row in our matrix.
	          for (int j = 0; j < myArray[i].length; j++) { //this equals to the column in each row.
	             System.out.print(myArray[i][j] + " ");
	          }
	          System.out.println(); //change line on console as row comes to end in the matrix.
	       
	      }
	 
	      inFS.close();
	      outFS.close(); 
	      fileByteStream.close();
	      }    
	}
}
