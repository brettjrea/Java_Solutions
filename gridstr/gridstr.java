

import java.util.Scanner;
import java.util.regex.*;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Formatter;

class gfg 
{
public static void gridStr (String str)
    {
   
        int k = 0;
        int row = 4;
        int column = 8;
        char s[][] = new char[row][column];
         
        // convert the string into grid
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if(k < str.length())
                    s[i][j] = str.charAt(k);
                k++;
            }
        }
 
        // Printing the grid
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (s[i][j] == 0)
                {
                    break;
                }
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str = "And the rest is rust and stardust";
        gridStr(str);
    }
}
 