import java.util.Scanner; 
public class Wordle {

	static Scanner gameReader = new Scanner (System.in);
	public static void main(String[] args) 
	{
		String soln = new String ("beach");
		
		
		System.out.println("Welcome to Wordle! ");
		
		playGame();

	gameReader.close();
	
	}
	public static void playGame()
	{ 
		System.out.print("Make a guess with a lowercase: ");
	}
	
	private static String playerErrors()
	{
		String playerGuess = new String (gameReader.next());
		
		if (playerGuess.length() != 5)
		{
			System.out.print("Guess a word with 5 letters please (no double letters) !!");
		}
		{
			
			
		}
		return playerGuess;
		
	}
	
	public static void playerGuess(String soln)
	{
		String errors = playerErrors();
		{
			//char 0 "b"
			if (errors.charAt(0) == soln.charAt(0))
			{
				System.out.print(soln.charAt(0));
			}
			
			else if (errors.charAt(1) == soln.charAt(0) || errors.charAt(2) == soln.charAt(0) || errors.charAt(3) == soln.charAt(0) || errors.charAt(4) == soln.charAt(0)) 
			{ 
				System.out.print("?");
			}
			
			else if (errors.charAt(0) != soln.charAt(0) || errors.charAt(0) != soln.charAt(1) || errors.charAt(0) != soln.charAt(2) || errors.charAt(0) != soln.charAt(3) || errors.charAt(0) != soln.charAt(4))
			{
				System.out.print("x");
			}
			
			//char 1 "e"
			if (errors.charAt(1) == soln.charAt(1))
			{
				System.out.print(soln.charAt(1));
			}
			
			else if (errors.charAt(0) == soln.charAt(1) || errors.charAt(2) == soln.charAt(1) || errors.charAt(3) == soln.charAt(1) || errors.charAt(4) == soln.charAt(1)) 
			{ 
				System.out.print("?");
			}
			
			else if (errors.charAt(1) != soln.charAt(1) || errors.charAt(1) != soln.charAt(2) || errors.charAt(1) != soln.charAt(3) || errors.charAt(1) != soln.charAt(4) || errors.charAt(1) != soln.charAt(0))
			{
				System.out.print("x");
			}
			
			//char 2 "a"
			if (errors.charAt(2) == soln.charAt(2))
			{
				System.out.print(soln.charAt(2));
			}
			
			else if (errors.charAt(0) == soln.charAt(2) || errors.charAt(1) == soln.charAt(2) || errors.charAt(3) == soln.charAt(2) || errors.charAt(4) == soln.charAt(2)) 
			{ 
				System.out.print("?");
			}
			
			else if (errors.charAt(2) != soln.charAt(2) || errors.charAt(2) != soln.charAt(1) || errors.charAt(2) != soln.charAt(3) || errors.charAt(2) != soln.charAt(4) || errors.charAt(2) != soln.charAt(0))
			{
				System.out.print("x");
			}
			
			//char 3 "c"
			if (errors.charAt(3) == soln.charAt(3))
			{
				System.out.print(soln.charAt(3));
			}
			
			else if (errors.charAt(0) == soln.charAt(3) || errors.charAt(1) == soln.charAt(3) || errors.charAt(2) == soln.charAt(3) || errors.charAt(4) == soln.charAt(3)) 
			{ 
				System.out.print("?");
			}
			
			else if (errors.charAt(3) != soln.charAt(3) || errors.charAt(3) != soln.charAt(0) || errors.charAt(3) != soln.charAt(1) || errors.charAt(3) != soln.charAt(2) || errors.charAt(3) != soln.charAt(4))
			{
				System.out.print("x");
			}
			
			//char 4 "h"
			if (errors.charAt(4) == soln.charAt(4))
			{
				System.out.print(soln.charAt(3));
			}
			
			else if (errors.charAt(0) == soln.charAt(4) || errors.charAt(1) == soln.charAt(4) || errors.charAt(3) == soln.charAt(4) || errors.charAt(2) == soln.charAt(4)) 
			{ 
				System.out.print("?");
			}
			
			else if (errors.charAt(4) != soln.charAt(4) || errors.charAt(4) != soln.charAt(0) || errors.charAt(4) != soln.charAt(1) || errors.charAt(4) != soln.charAt(2) || errors.charAt(4) != soln.charAt(3))
			{
				System.out.print("x");
			}
			
			
			if (errors.charAt(0) == soln.charAt(0) && errors.charAt(1) == soln.charAt(1) && errors.charAt(2) == soln.charAt(2) && errors.charAt(3) == soln.charAt(3) &&  errors.charAt(4) == soln.charAt(4))
			{
				System.out.print(soln);
			}
			
			
			
		}
		
	}
	
	
	

}
