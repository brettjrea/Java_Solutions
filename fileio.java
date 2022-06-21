import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileio {
	public static void main(String[] args) throws IOException {
	      FileInputStream fileByteStream = null; // File input stream
	      Scanner inFS = null;                   // Scanner object
	      double fileNum = 0;
	      double maxfileNum = 0;
	      double minfileNum = Double.POSITIVE_INFINITY;
	      double averageNum = 0;
	      double totalNum = 0;
	      int countCont = 0;
	      
	      FileOutputStream fileStream = null;	 //File output stream
	      PrintWriter outFS = null;				 //Writer object
	      
	      // Try to open input file
	      System.out.println("Opening input file myfile.txt.");
	      fileByteStream = new FileInputStream("myfile.txt");
	      inFS = new Scanner(fileByteStream);
	      
	      // Try to open output file
	      System.out.println("Opening output filemyoutfile.txt.");
	      fileStream = new FileOutputStream("myoutfile.txt");
	      outFS = new PrintWriter(fileStream);


	      // File is open and valid if we got this far (otherwise exception thrown)
	      System.out.println("Reading and printing numbers.");
	    
	      while (inFS.hasNextDouble()) {
	         fileNum = inFS.nextDouble();
	         System.out.println("$" + fileNum);
	         countCont++;
	         
	         totalNum = totalNum + fileNum;
	         averageNum = totalNum / countCont;
	         
	         if (fileNum > maxfileNum) {
	        	 maxfileNum = fileNum;
	         }
	         
	         if (fileNum < minfileNum) {
	        	 minfileNum = fileNum;
	         }   
	         
	         if (totalNum > 10000000) {
	        	 break;
	         }
	      }
	      System.out.println("$" + totalNum);
	      System.out.println("$" + averageNum);   
	      System.out.println("MAX $" + maxfileNum);
	      System.out.println("MIN $" + minfileNum);
	      System.out.println("Writing numbers to file.");
	      outFS.println("It took " + countCont + " contributions to reach the goal.");
	      outFS.println("The maximum contribution received was $" + maxfileNum);
	      outFS.println("The minimum contribution received was $" + minfileNum);
	      outFS.println("The average contribution received was " + averageNum + ".");
	      outFS.println("A total of " + totalNum + " was collected.");
	      outFS.close(); // Done with file, so try to close it
	      
	      System.out.println("Closing file myfile.txt.");
		  System.out.println("Closing file myoutfile.txt.");
	      fileByteStream.close(); // close() may throw IOException if fails
	      
	}
	}

