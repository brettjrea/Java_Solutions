package cards;

import java.io.*;

import java.util.*;

public class PlayingCard {

//instance private variables

private char suit;

private int value;

// constructor

public PlayingCard(char s, int v) {

suit = s;

value = v;

}

//this method sets the suit

public void setSuit(char s) {

suit = s;

}

//this method sets the value

public void setValue(int v) {

value = v;

}

//this method returns the suit

public char getSuit() {

return suit;

}

//this method returns the value

public int getValue() {

return value;

}

//toString() method returns the suit type and the value

@Override

public String toString() {

char suit_type = getSuit();

int val = this.getValue();

String playing_card = "";

if (val == 13)

playing_card += "( " + "K, "+ suit_type +" )";

else if (val == 12)

playing_card = "( " + "Q, "+ suit_type + " )";

else if (val == 11)

playing_card = "( " + "J, "+ suit_type +" )";

else if (val == 14)

playing_card = "( "+ "A, "+ suit_type + " )";

else

playing_card = "( " +val+", " + suit_type + " )";

return playing_card;

}

/**

*isMatch() method takes PlayingCard object as an arguement and returns

* true if the calling object has the same value OR same suit as that of the argument object

* false otherwise

*/

public boolean isMatch(PlayingCard p) {

if (this.getSuit() == p.getSuit() || this.getValue() == p.getValue())

return true;

else

return false;

}

public static void main(String[] args) {

// Scanner class helps to take inputs

Scanner sc = new Scanner(System.in); // created an object of Scanner class

//creating a user defined PlayingCard object

System.out.print("Enter suit: ");

char s = sc.nextLine().charAt(0); //input for suit

System.out.print("Enter value: ");

int v = Integer.parseInt(sc.nextLine()); //input for value

PlayingCard user_card = new PlayingCard(s, v);

System.out.println("User card : "+user_card); //prints user card

//calling isMatch() method

// you may change the suit type or the value of the argument object

boolean matching1 = user_card.isMatch(new PlayingCard('H', 12));

System.out.println("Do the cards match? "+matching1); //prints the result of isMatch()

//another example
//You may first create the PlayingCard object and then pass it as argument as shown below

PlayingCard p = new PlayingCard('C', 2); //creating new PlayingCard

System.out.println("New Playing Card:" + p);//printing details of new Card

boolean matching2 = user_card.isMatch(p); //calling isMatch() method

System.out.println("Do the cards match? "+matching2); //prints the result of isMatch()

}

}