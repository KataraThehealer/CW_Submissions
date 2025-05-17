import java.util.Scanner;
public class TicTacToe{
	
	static boolean check = false;
	static Scanner myReader = new Scanner(System.in);
	static String[][] gridNums = new String[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is the introduction to tic-tac-toe
		System.out.println("Welcome to Tic-Tac-Toe!"
				+ "The objective is to get either the X's or O's (Based on your choice) 3 in a row. Either Vertically or Horizontally.");
		System.out.println();
		makeTable();
			
			while(check == false)
			{
				gameStart(ticTacToGrid(gridNums));
				ticTacToGrid(gridNums);
				endGame();
				
			}
		
	}
	

public static String[][] ticTacToGrid(String[][] gridNums2)
	  {
		for(int i =0; i<gridNums2.length; i++)
		{
			for(int j=0; j<gridNums2[i].length; j++)
			{
				System.out.print(gridNums2[i][j]);
				System.out.print(", ");
			}
			System.out.println(" ");
		}
	 	System.out.println(" ");
		return gridNums2;
		
	}
	 
	
public static void makeTable()
{
	System.out.println("Please Choose a letter to put an X or O.. "
			+ "\n"+"Capital = X and Lowercase = O"
			+"\n"+"  A  |  B  |  C  \n-----------------\n  "
			+ "D  |  E  |  F  \n-----------------\n  "
			+ "G  |  H  |  I   ");
	System.out.println();
}
	
	
	public static String[][] gameStart(String[][] gridNums2)
	{
		String userInput=  new String(myReader.nextLine());
		
		if(userInput.equals("A"))
		{
			gridNums[0][0] = "X";
		}
		else if(userInput.equals("a"))
		{
			gridNums[0][0] = "O";
		}
		
		if(userInput.equals("B"))
		{
			gridNums[0][1] = "X";
		}
		else if(userInput.equals("b"))
		{
			gridNums[0][1] = "O";
		}
		
		
		if(userInput.equals("C"))
		{
			gridNums[0][2] = "X";
		}
		else if(userInput.equals("c"))
		{
			gridNums[0][2] = "O";
		}
		
		if(userInput.equals("D"))
		{
			gridNums[1][0] = "X";
		}
		else if(userInput.equals("d"))
		{
			gridNums[1][0] = "O";
		}
		
		if(userInput.equals("E"))
		{
			gridNums[1][1] = "X";
		}
		else if(userInput.equals("e"))
		{
			gridNums[1][1] = "O";
		}
		if(userInput.equals("F"))
		{
			gridNums[1][2] = "X";
		}
		else if(userInput.equals("f"))
		{
			gridNums[1][2] = "O";
		}
		
		
		if(userInput.equals("G"))
		{
			gridNums[2][0] = "X";
		}
		else if(userInput.equals("g"))
		{
			gridNums[2][0] = "O";
		}
		
		if(userInput.equals("H"))
		{
			gridNums[2][1] = "X";
		}
		else if(userInput.equals("h"))
		{
			gridNums[2][1] = "O";
		}
		
		if(userInput.equals("I"))
		{
			gridNums[2][2] = "X";
		}
		else if(userInput.equals("i"))
		{
			gridNums[2][2] = "O";
		}
		makeTable();
		return gridNums;
	}
	public static String[][] endGame()
	{
		if(gridNums[0][0] == gridNums[0][1] && gridNums[0][2] == gridNums[0][1] && (gridNums[0][1] == "X" || gridNums[0][1] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		if(gridNums[1][0]==gridNums[1][1] && gridNums[1][2] == gridNums[1][1] && (gridNums[1][0] == "X"|| gridNums[1][0] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		if(gridNums[2][0]==gridNums[2][1] && gridNums[2][2]==gridNums[2][1] && (gridNums[2][0] == "X"|| gridNums[2][0] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		
		if(gridNums[0][0] == gridNums[1][0] && gridNums[2][0] == gridNums[1][0] && (gridNums[0][0] == "X"|| gridNums[0][0] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		if(gridNums[0][1] == gridNums[1][1] && gridNums[2][1] == gridNums[1][1] && (gridNums[0][1] == "X"|| gridNums[1][0] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		if(gridNums[0][2] == gridNums[1][2] && gridNums[2][2] == gridNums[1][2] && (gridNums[1][1] == "X") && (gridNums[1][1] == "X"|| gridNums[1][1] == "O"))
		{
			check = true;
			System.out.println("Congrats I guess!! You won for now...");
		}
		return gridNums;
	}
	
}
