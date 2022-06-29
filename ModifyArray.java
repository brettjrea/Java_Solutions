import java.util.Scanner;

public class ModifyArray {

    public static void swapArrayEnds(int[] arrVals) {
        int i; 
        int firstIndex = 0;
        int firstNum = arrVals[firstIndex];
        int lastIndex = arrVals.length -1;
        int lastNum = arrVals[lastIndex];
  
        for (i = 0; i < 1; ++i) {
         arrVals[firstIndex] = lastNum;
         arrVals[lastIndex] = firstNum;
        }
        return;
     }
  

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
