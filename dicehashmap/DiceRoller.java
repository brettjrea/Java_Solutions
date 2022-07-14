package dicehashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 


public class DiceRoller {
    private static int totalFaces = 0;
    private static int totalRolls = 0; 
    private static int totalPairs = 0; 
    private static int totalTriples = 0;
    private static int totalQuads = 0;
    private static int totalFives = 0;
    // map to hold the dices of the rolls

    static Map<Integer, Integer> dice1 = new HashMap<>();
    static Map<Integer, Integer> dice2 = new HashMap<>();
    static Map<Integer, Integer> dice3 = new HashMap<>();
    static Map<Integer, Integer> dice4 = new HashMap<>();
    static Map<Integer, Integer> dice5 = new HashMap<>();

    public static void main(String[] args){ 
        // initialize the Scanner
        Scanner input = new Scanner(System.in);
        // fill the map with numbers from 1 to 6 like the die
        // each number has a corresponding value, initially 0 
        System.out.print("How many faces should each die have? ");
        totalFaces = input.nextInt();
        
        for(int i=1; i<=totalFaces; i++){
            dice1.put(i, 0);
        }

        for(int i=1; i<=totalFaces; i++){
            dice1.get(i);
        }
       
        for(int i=1; i<=totalFaces; i++){
            dice2.put(i, 0);
        }
        
        for(int i=1; i<=totalFaces; i++){
            dice3.put(i, 0);
        }

        for(int i=1; i<=totalFaces; i++){
            dice4.put(i, 0);
        }

        for(int i=1; i<=totalFaces; i++){
            dice5.put(i, 0);
        }
       
        System.out.print("How many times should I roll the dice? ");
        totalRolls = input.nextInt();
   

        // repeat the rolling 
        for (int x = 0; x < totalRolls; x++) { 
            rollDice();
        } 

        input.close();  
  
        System.out.println("In " + totalRolls + " rolls, you rolled " + totalPairs + " pairs, " + totalTriples + " triples, " + totalQuads + " quads, " + totalFives + " fives");
    }

    // this method returns the roll dice
    public static void rollDice(){
         int die1, die2, die3, die4, die5, totalFaces;
         totalFaces = DiceRoller.totalFaces;
         die1 = (int)(Math.random()*totalFaces) + 1;
         die2 = (int)(Math.random()*totalFaces) + 1;
         die3 = (int)(Math.random()*totalFaces) + 1;
         die4 = (int)(Math.random()*totalFaces) + 1;
         die5 = (int)(Math.random()*totalFaces) + 1;

         if(die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5){
             totalFives++;
         }
     

       
     
         // increment the current value and update the map dice
         dice1.put(die1, dice1.get(die1)+1); 
         dice2.put(die2, dice2.get(die2)+1); 
         dice3.put(die3, dice3.get(die3)+1);
         dice4.put(die4, dice4.get(die4)+1);
         dice5.put(die5, dice5.get(die5)+1);

    
    }
}