package encrypttext;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EncryptText {
        
        // read file and return all content as a String 
        public static String readFile(String filename) throws IOException {
                Scanner scanner = new Scanner(new File(filename));
                String content = "";
                while(scanner.hasNextLine()){   
                        content += scanner.nextLine();
                }
                return content;
        }
        
        // fills entire grid with stars "*"
        public static void initializeGrid(char [][] grid, int m, int n) {
                for(int i = 0; i<m; i++) 
                        for(int j = 0; j<n; j++)
                                grid[i][j] = '*';
        }
        
        // does the encryption
        public static void fillGrid(char [][] grid, int m, int n, String filename) throws IOException {
                
                // read file
                String text = readFile(filename); 
                
                // fill entire grid with stars
                initializeGrid(grid, m, n);
                
                // i = row, j = column, for grid
                int i = 0, j = 0;
                
                // picks a char c from file text and populates the grid
                for(int k=0; k<text.length(); k++) {
                        
                        char c = text.charAt(k);
                        
                        // even row - fill left to right
                        if(i % 2 == 0) {
                                grid[i][j] = c;
                                j++;
                        }
                        // odd row - fill right to left
                        else {
                                grid[i][n-j-1] = c;
                                j++;
                        }
                        
                        // if end of column, go to next row and restart column
                        if(j == n) {
                                i++;
                                j = 0;
                        }
                        
                        // if end of rows, stop populating grid
                        if(i == m) {
                                break;
                        }
                }
        }
        
        // extract chars in column-major order
        public static void displayGrid(char [][] grid, int m, int n) {
                for(int j = 0; j<n; j++) {  // cols
                        for(int i = 0; i<m; i++) // rows
                                System.out.print(grid[i][j]);
                }
        }
        
        // start        
        public static void main(String[] args) throws IOException {
                
                String filename = "input.in";
                
                // define grid dimensions, m = rows, n = cols
                int m = 4, n = 8;   
                
                // define the grid
                char grid[][] = new char[m][n];
                
                // call the function to fill grid
                fillGrid(grid, m, n, filename);
                
                // show encrypted text
                displayGrid(grid, m, n);
                        
        }

}