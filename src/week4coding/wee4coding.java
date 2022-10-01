package week4coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class wee4coding {

	public static void main(String[] args) {
		
// 1.	Create an array of int called ages that contains the following values:
//		3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 75, 8, 28, 93 };
//	a.	Programmatically subtract the value of the first element in the array
//		from the value in the last element of the array (i.e. do not use ages[7] in
//		your code). Print the result to the console.  
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
//	b.	Add a new age to your array and repeat the step above to ensure it is
//		dynamic (works for arrays of different lengths).
// 	 	the new age i added is ages[6] or 75.
		
//	c.	Use a loop to iterate through the array and calculate the average age.
//		Print the result to the console.
		
		double sum = IntStream.of(ages).sum();
		
		System.out.println(sum / ages.length);
		
//2.	Create an array of String called names that contains the following values:
//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
//	a.	Use a loop to iterate through the array and calculate the average number
//		of letters per name. Print the result to the console.
	
	double result = 0;
	for(String name : names) {
		result += name.length();
		}
	
	System.out.println(result / names.length);
	
//	b.	Use a loop to iterate through the array again and concatenate all the names
//		together, separated by spaces, and print the result to the console.
	
	String str = "";
	for(int i = 0; i < names.length; i++) {
		str += names[i] + ", ";
	}
	System.out.println(str);
	
//  	Originally i used .join which was cool but i saw that we had to write a loop specifically
//		String str = String.join(", ", names);
//		System.out.println(str);
	
//3.	How do you access the last element of any array?
	
	System.out.println(names[names.length - 1]);
	
//4.	How do you access the first element of any array?
	
	System.out.println(names[0]);
	
//5.	Create an int[] called nameLengths and write a loop to iterate over the previously created names
//		Array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
//		Just printing out my array to check if it looks right
		System.out.println(Arrays.toString(nameLengths));
		
//6.	Use a loop to iterate over the nameLengths array and calculate the sum of all the elements
//		in the array. Print the result to the console.
		int sumOfLengths = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			sumOfLengths += nameLengths[i];
		}
		System.out.println("The sum of all the integers in nameLengths is: " + sumOfLengths);
		
//7.	Write a method that takes String word and int n and returns a String called multiplyString
//		that is word concatenated with itself "n" number of times:
//		This is a test of that method:
		
		String word = "Hello";
		int n = 3;
		System.out.println(multiplyString(word, n));
		
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
//		(The full name should be the first and last name with a space:
//		This is a test of that method:
		
		String firstName = "Noam";
		String lastName = "Chomsky";
		System.out.println(returnFullName(firstName, lastName));
	
//9.	Write a method that takes an array of int and returns true if the sum of all the ints in
//		the array is greater than 100:
//		this is a test of that method:
		
		int[] numArray = {33, 12, 45, 16, 70};
		System.out.println(isSumGreaterThan100(numArray));

//10.	write a method that takes an array of double and returns the average of all elements
//		in the array:
//		this is a test of that method:
		
		double[] numDub = {50.78, 40.67, 70.45, 12.34};
		System.out.println(getAverageDouble(numDub));
		
//11.	Write a method that takes two arrays of double and returns true if the average of 
//		the elements in the first array is greater than the average of the elements in the second array.

		double[] newDubArray = {33.6, 20.4, 700, 12.98};
		System.out.println(isAverageDoubleGreater(numDub, newDubArray));
		
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
//		double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
//		is greater than 10.50.
		
		boolean isHotOutside = true;
		double moneyInPocket = 8;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
//13.	Create a method of your own that solves a problem. In comments, write what the 
//		method does and why you created it.
//		this is a test of the method:
		
		String wifeSays = "I love you!";
		double money = 30.24;
		boolean dinnerPlans = true;
		System.out.println("I am a happy camper: " + amIAHappyCamper(dinnerPlans, money, wifeSays));
		
	
//METHOD 7.	Write a method that takes String word and int n and returns a String called multiplyString
//		that is word concatenated with itself "n" number of times:
		
	}
	public static String multiplyString(String word, int n) {
		String multiplyString = "";
		for (int i = 0; i < n; i++) {
		 multiplyString += word;
		}return multiplyString;
		
	}
//METHOD 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
//		(The full name should be the first and last name with a space:	
	
	public static String returnFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
//METHOD 9.	Write a method that takes an array of int and returns true if the sum of all the ints in
//		the array is greater than 100:
	
	public static boolean isSumGreaterThan100(int[] numArray) {
		return Arrays.stream(numArray).sum() > 100;
		
	}
//METHOD 10. write a method that takes an array of double and returns the average of all elements
//		in the array:
	
	public static double getAverageDouble(double[] numDub) {
		return Arrays.stream(numDub).sum() / numDub.length;
	}

//METHOD 11.  Write a method that takes two arrays of double and returns true if the average of 
//		the elements in the first array is greater than the average of the elements in the second array.

	public static boolean isAverageDoubleGreater(double[] averageOne, double[] averageTwo) {
		double average1 = getAverageDouble(averageOne);
		double average2 = getAverageDouble(averageTwo);
		if(average1 < average2) {
			return false;
		}return true;
	}
//METHOD 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
//		double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
//		is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}return false;
	}
	
//METHOD 13.  Create a method of your own that solves a problem. In comments, write what the 
//		method does and why you created it.
	
	public static boolean amIAHappyCamper(boolean dinnerPlans, double money, String wifeSays) {
		if (dinnerPlans = true && money > 20.34 && wifeSays == "I love you!") {
			return true;
		}return false;
	}

}
	
		

	


