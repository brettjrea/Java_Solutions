import java.util.Scanner;

public class product {
   public static void main(String[] args) {
      System.out.println ("Enter 4 Values: ");
      Scanner scnr = new Scanner(System.in);
      double num1 = scnr.nextInt();
      double num2 = scnr.nextInt();
      double num3 = scnr.nextInt();
      double num4 = scnr.nextInt();
      double product = num1 * num2 * num3 * num4;
      double sum = num1 + num2 + num3 + num4;
      double average = sum / 4;
      

      System.out.printf("%.3f", product);
      System.out.println(" ");
      System.out.printf("%.3f", average);
      System.out.println(" ");
      scnr.close();
   }
}
