import java.util.Scanner;

public class Strings_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//my scanner (allows user to type in console.)
		Scanner myReader = new Scanner(System.in);
		String myWord = new String(myReader.next());
		
		
		myReader.close();
		
		
		
	
		printSecondAndLastLetter(myWord);
		findTheYThat(myWord);
		getLength(myWord);
		firstAndLastThree(myWord);
	
	}
	
	//Q: 2.. 
	/**
	 *  this method will print the second and last letter of the word
	 * @param lovely
	 */
	public static void printSecondAndLastLetter(String lovely)
	{
		System.out.println("The second letter is " +lovely.charAt(1)+ " and the last letter is "+lovely.charAt(lovely.length()-1) +".");
	}
	
	
	//Q: 3
	/**
	 * This method finds the index of y
	 * @param "Motherly"
	 */
	public static int findTheYThat(String Motherly)
	{
		
		return Motherly.indexOf('y');
	}
	
	//Q: 4
	/**
	 * this method will find the length of the word
	 * @param "Burger"
	 */
	public static int getLength(String Burger)
	{
		System.out.println("The length is " + Burger.substring(Burger.length()) + ".");
		return Burger.length();
	}
	
	//Q: 5
	/**
	 * this method will find the first character and the last three characters.
	 * @param "cheeseburger"
	 */
	
	public static void firstAndLastThree(String cheeseburger)
	{
		System.out.print("The first three letters are "+cheeseburger.substring(0,3));
		System.out.print(" and the last three letters are " +cheeseburger.substring(cheeseburger.length()-3) + ".");

	}
}
