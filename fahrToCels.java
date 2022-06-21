import java.util.Scanner;

public class fahrToCels {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double fahrIn;
	      double tmpVal;
	      
	      System.out.print("Enter a Fahrenheit temperature:");
	      tmpVal = scnr.nextDouble();
	      fahrIn = tmpVal;
	      tmpVal = (tmpVal - 32) * 5 / 9;
	      
	      System.out.print((int)fahrIn + "F is equivalent to ");
	      System.out.printf("%.2f", tmpVal);
	      System.out.println("C");
	      System.out.println(" ");
	      
	      
	      double celsIn;
	      double tmpVal2;
	      
	      System.out.print("Enter a Celsius temperature:");
	      tmpVal2 = scnr.nextDouble();
	      celsIn = tmpVal2;
	      tmpVal2 = (9.0 / 5.0) * tmpVal2 + 32;
	      
	      System.out.print((int)celsIn + "C is equivalent to ");
	      System.out.printf("%.2f", tmpVal2);
	      System.out.printf("F");
		  scnr.close();
}
}