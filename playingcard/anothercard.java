import java.util.*;
public class PlayingCard
{	
public static void main(String[] args) {
	char suit_type = 0;
	int val = 0;
	int count = 0;
	String temp = "";
	ArrayList<String> arrayList= new ArrayList<>(52);			
		createDeck(arrayList, count, suit_type,  val);
		getValues(arrayList, temp);
		toString(suit_type, val);
}	

public static void createDeck(ArrayList<String> arrayList, int count, char suit_type, int val)
{
for(val=2; val<=14;val++){
count = 0;	
arrayList.add(toString(setSuit(count, suit_type),val));//clubs
count++;
}
for(val=2;val<=14;val++){
count= 1;
arrayList.add(toString(setSuit(count, suit_type),val));//diamonds
count++;
}
for(val=2;val<=14;val++){
count= 2;
arrayList.add(toString(setSuit(count, suit_type),val));//heart
count++;
}
for(val=2;val<=14;val++){
count= 3;
arrayList.add(toString(setSuit(count, suit_type),val));//spade
count++;
}
}

public static char setSuit(int count, char suit_type){
if (count == 0) {suit_type='H';}
if (count == 1) {suit_type='D';}
if (count == 2) {suit_type='C';}
if (count == 3) {suit_type='S';}
return suit_type;
}

public static void getValues(ArrayList<String> arrayList, String temp) {
	Random rand=new Random();
	int n1=rand.nextInt(52);
	int n2=rand.nextInt(52);
	String p1=arrayList.get(n1);
	String p2=arrayList.get(n2);
	temp = isMatch(p1, p2);
	System.out.print(p1);
	System.out.print(p2);
	System.out.print(temp);

}

private static String isMatch(String p1, String p2) {
	String temp;
	if (p1.charAt(1) == p2.charAt(1) || p1.charAt(3) == p2.charAt(3))
	{
	 temp="is a match";	
	}
	else {
		temp="is not a match";	
	}
	return temp;
}

public static String toString(char suit_type, int val) {
String playing_card = "";
if (val == 14) {
playing_card = "(" +suit_type+",A)";
}
else if (val == 13) {
playing_card += "(" + suit_type + ",K)";
}
else if (val == 12) {
playing_card = "(" +suit_type +",Q)";
}
else if (val == 11) {
playing_card = "(" +suit_type +",J)";
}
else {
playing_card = "(" + suit_type + ","+ val + ")";
}
return playing_card;
}

}