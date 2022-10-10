package playingcard;

import java.util.*;
public class PlayingCard
{
public static String toString(char suit_type,int val) {
String playing_card = "";
if (val == 13) {
playing_card += "(" + suit_type + ",K)";
}
else if (val == 12) {
playing_card = "(" +suit_type +",Q)";
}

else if (val == 11) {
playing_card = "(" +suit_type +",J)";
}
else if (val == 14) {
playing_card = "(" +suit_type+",A)";
}
else {
playing_card = "(" + suit_type + ","+ val + ")";
}
return playing_card;

}
public static void driver(){
ArrayList<String> arrayList= new ArrayList<>(52);
//H-hearts , C-clubs, S-spades, D-diamonds.
for(int j=2;j<=14;j++ ){
arrayList.add(toString('C',j));
}
for(int j=2;j<=14;j++ ){
arrayList.add(toString('D',j));
}
for(int j=2;j<=14;j++ ){
arrayList.add(toString('H',j));
}
for(int j=2;j<=14;j++ ){
arrayList.add(toString('S',j));
}
Random rand=new Random();
int n1=rand.nextInt(52);
int n2=rand.nextInt(52);
String s1=arrayList.get(n1);
String s2=arrayList.get(n2);
System.out.println("Random card one:"+s1);
System.out.println("Random card two:"+s2);
String temp="",temp2="";
if(s1.charAt(3)>57){
if(s1.charAt(3)=='K'){
temp="king";
}
else if(s1.charAt(3)=='Q'){
temp="Queen";
}
else if(s1.charAt(3)=='J'){
temp="Jack";
}
else{
temp="Ace";
}
}
else{
temp+=s1.charAt(3);
}


if(s2.charAt(3)>57){
if(s2.charAt(3)=='K'){
temp2="king";
}
else if(s2.charAt(3)=='Q'){
temp2="Queen";
}
else if(s2.charAt(3)=='J'){
temp2="Jack";
}
else{
temp2="Ace";
}
}
else{
temp2+=s2.charAt(3);
}


//printing .......
if(s1.charAt(1)=='C'){
System.out.print(s1+" for the "+temp+" of clubs , ");
}
if(s1.charAt(1)=='D'){
System.out.print(s1+" for the "+temp+" of diamonds , ");
}
if(s1.charAt(1)=='H'){
System.out.print(s1+" for the "+temp+" of hearts , ");
}
if(s1.charAt(1)=='S'){
System.out.print(s1+" for the "+temp+" of spades , ");
}
if(s2.charAt(1)=='C'){
System.out.println(s2+" for the "+temp2+" of clubs");
}
if(s2.charAt(1)=='D'){
System.out.println(s2+" for the "+temp2+" of diamonds");
}
if(s2.charAt(1)=='H'){
System.out.println(s2+" for the "+temp2+" of hearts");
}
if(s2.charAt(1)=='S'){
System.out.println(s2+"for the "+temp2+" of spades");
}

}
public static void main(String[] args) {
driver();
}
}