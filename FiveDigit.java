import java.util.Scanner;

public class FiveDigit {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int tmpVal;
	      int fifthDigit;
	      int fourthDigit;
	      int thirdDigit;
	      int secondDigit;
	      int firstDigit;  
	      int sumDigits;
	    
	      System.out.print("Enter a 5-digit positive integer: ");
	      tmpVal = scnr.nextInt();
	      
	      fifthDigit = tmpVal % 10;
	      tmpVal   = tmpVal / 10;
	      
	      fourthDigit = tmpVal % 10;
	      tmpVal   = tmpVal / 10;
	      
	      thirdDigit = tmpVal % 10;
	      tmpVal   = tmpVal / 10;
	      
	      secondDigit = tmpVal % 10;
	      tmpVal   = tmpVal / 10;

	      firstDigit = tmpVal % 10;
	      tmpVal   = tmpVal / 10;
	      
	      sumDigits = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
	      
	      System.out.println("The sum of the digits is" + " " + firstDigit + " + " + secondDigit + " + " + thirdDigit + " + " + fourthDigit + " + " + fifthDigit + " = " + sumDigits);	 
		  scnr.close(); 
}
}