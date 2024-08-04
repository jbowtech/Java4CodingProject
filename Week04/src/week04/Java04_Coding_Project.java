package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java04_Coding_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Ages arrays:");
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
int last = ages[ages.length-1];
int first = ages[0];
System.out.println(last - first);
System.out.println("---------------");
int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 72, 31};
int last2 = ages2[ages2.length-1];
int first1 = ages2[0];
System.out.println(last2-first1);
System.out.println("Using Index");
System.out.println(ages[7]-ages[0] + " is the same value of the 2nd line on console, but here we are using the index to get the answer.");
System.out.println("Average Age");
int lengthOfAges = ages.length;
int sum =  0;
for (int i = 0; i < ages.length; i ++ ) {
	sum +=ages[i];
}
double avgAge = sum/lengthOfAges;
System.out.println(avgAge );
System.out.println("----------");

String[]names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
for (int i =0 ; i < names.length; i++) {
	//System.out.println(names[i].length());
	int newLength = names[i].length();
	System.out.println(newLength);
}
System.out.println(combineStrings(names));
System.out.println("--------");
System.out.println("The last element of an Array is accessible by array[array.length-1].");
System.out.println("The first element in an array is accessed by array[0].");
int[] nameLengths = new int[names.length];
for(int i = 0; i < names.length; i++){
    nameLengths[i] = names[i].length();
}
System.out.println(Arrays.toString(nameLengths));

int sum1 = 0;
for (int i = 0; i < nameLengths.length; i++) {
	sum1+= nameLengths[i];
}
System.out.println(sum1);

String word = "Hello";
int n = 3;
System.out.println(concatenatedSting(word, n));
System.out.println("------------");

String firstName = "Jack ";
String lastName = "Euric";
System.out.println(fullName(firstName,lastName));
System.out.println("------");


int[] numbers = { 25,40,36};
int sum2 = Arrays.stream(numbers).sum();
System.out.println(sum2 > 100);
System.out.println("-----");

double[] numbers3 = { 2.2, 3.0,5.3};
double sum3 = Arrays.stream(numbers3).sum();
System.out.println(sum3/numbers3.length);
System.out.println("-----");
double[] numbers4 = { 3.7, 3.0,4.1};
double sum4 = Arrays.stream(numbers4).sum();
System.out.println(sum3 > (sum4/numbers4.length));
System.out.println("----");
 System.out.println("I will buy a drink today");
boolean isHotOutside = true;
double moneyInPocket = 11.50;
System.out.println(willBuyDrink(isHotOutside,moneyInPocket));

System.out.println("My Method ");
//This code returns 2 possible text responses, depending if the data in the string "correctDoor" is the same as the data in one the elements in the List.
String correctDoor = "Door 3";
List<String> str = new ArrayList<>();
str.add("Door 1");
str.add("Door 2");
str.add("Door 3");
if(correctDoor == str.get(0)) {
	System.out.println("You have chosen the wrong door.");
}else if (correctDoor == str.get(1)) {
	System.out.println("You have chosen the wrong door.");
}else if (correctDoor == str.get(2)) {
	System.out.println("Congratulations, you have chosen the right door, proceed to collect your prize.");
}
 




	}
	
	public static String combineStrings(String[] names) {
		StringBuilder result = new StringBuilder();
		for (String string : names) {
			result.append(string + " ");
		}
		return result.toString();
	}
	
	public static String concatenatedSting(String word, int n) {
		String string1 = "";
		for (int i=0; i < n; i++) {
			string1 += word;	
		}
		return string1;
	}
public static String fullName(String firstName, String lastName) {
	String completeName = firstName.concat(lastName);
	return completeName;
}

public static Boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if (moneyInPocket > 10.50 && isHotOutside) {
		return true;
	}
	else return false;
}
		
	


	 
 

}
