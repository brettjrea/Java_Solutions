package stringio;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class stringio {
	public static void main(String[] args) throws IOException {
	      FileInputStream fileByteStream = null; 
	      Scanner inFS = null;                  
	      String fileString = null;
	      int stringSize;
	      int breakPoint;
	      String str1;
	      String str2;
	      
	      FileOutputStream fileStream = null;	 
	      PrintWriter outFS = null;	

	      System.out.println("Opening input file input.in.");
	      fileByteStream = new FileInputStream("stringio/input.in");
	      inFS = new Scanner(fileByteStream);
	      
	      System.out.println("Opening output file results.out.");
	      fileStream = new FileOutputStream("stringio/results.out");
	      outFS = new PrintWriter(fileStream);

	      System.out.println("Reading and printing numbers.");
	    
	      while (inFS.hasNext()) {
	         fileString = inFS.next();
	         fileString = fileString.toUpperCase();
	         stringSize = fileString.length();
	         breakPoint = stringSize / 2;
	         
	         
	         if (stringSize % 2 == 0) {
	        	 str1 = fileString.substring(fileString.length() - breakPoint,fileString.length());
	        	 str2 = fileString.substring(0, breakPoint);
	        	 System.out.format("%-15s%-1s%-15s\n",fileString,str1,str2);	 
	             outFS.format("%-15s%-1s%-15s\n",fileString,str1,str2);
	      
	             }
	             else if (stringSize % 2 != 0) {
	             str1 = fileString.substring(fileString.length() - breakPoint,fileString.length());
	             str2 = fileString.substring(0, breakPoint + 1); 
	             System.out.format("%-15s%-1s%-15s\n",fileString,str1,str2);
	             outFS.format("%-15s%-15s%-15s\n",fileString,str1,str2);
	 
	             }
	      }
		  inFS.close();
	      outFS.close(); 
	      fileByteStream.close();
	      }    
	}