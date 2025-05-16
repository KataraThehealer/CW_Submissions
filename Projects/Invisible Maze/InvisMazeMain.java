import java.util.Scanner;

public class InvisMazeMain {
	
	static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MazeGameTile[][] maze = new MazeGameTile[5][5];
		
		maze[0][0] = new MazeGameTile(true,true, false);
		maze[0][1] = new MazeGameTile(false,false, false);
		maze[0][2] = new MazeGameTile(false,false, false);
		maze[0][3] = new MazeGameTile(false,false, true);
		maze[0][4] = new MazeGameTile(false,false, true);
		
		maze[1][0] = new MazeGameTile(false,false, true);
		maze[1][1] = new MazeGameTile(false,false, true);
		maze[1][2] = new MazeGameTile(false,false, false);
		maze[1][3] = new MazeGameTile(false,false, true);
		maze[1][4] = new MazeGameTile(false,false,true);
		
		maze[2][0] = new MazeGameTile(false,false,true);
		maze[2][1] = new MazeGameTile(false,false,true);
		maze[2][2] = new MazeGameTile(false,false,false);
		maze[2][3] = new MazeGameTile(false,false,false);
		maze[2][4] = new MazeGameTile(false,false,true);
		
		maze[3][0] = new MazeGameTile(false,false,true);
		maze[3][1] = new MazeGameTile(false,false,true);
		maze[3][2] = new MazeGameTile(false,false,true);
		maze[3][3] = new MazeGameTile(false,false,false);
		maze[3][4] = new MazeGameTile(false,false, true);
		
		maze[4][0] = new MazeGameTile(false,false,true);
		maze[4][1] = new MazeGameTile(false,false,true);
		maze[4][2] = new MazeGameTile(false,false,true);
		maze[4][3] = new MazeGameTile(false,false,false);
		maze[4][4] = new MazeGameTile(false,false,false);
		
		//Creating an object
		InvisMainChar player = new InvisMainChar();
		Maze(maze);
		
		System.out.println("Welcome!! Please choose what direction you would like to go: right, left, up or down :)");
		moveonMaze(maze,player);
		
		
	
	}
	//Layout of the maze
	public static void Maze(MazeGameTile[][] tempMaze)
	{
		for(int i =0; i<=tempMaze.length-1; i++)
		{
			for(int j=0; j<=tempMaze[0].length-1; j++)
			{
				System.out.print(tempMaze[i][j]);
				System.out.print(", ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}
	
	


	//All of the commands on how the user wants to move
	public static void moveonMaze(MazeGameTile[][] tempMaze, InvisMainChar player)
	{
		String userInput=  myReader.next();
		
		if(userInput.equals("right"))
		{
			if(player.getcPos()<=4)
			{
				if(tempMaze[player.getrPos()][player.getcPos()+1].getIsWall() == true)
				{
					tempMaze[player.getrPos()][player.getcPos()].setIsRevealed(true);
					System.out.println("You ran into a wall... maybe try again?");
				}
				
				else if(tempMaze[player.getrPos()][player.getcPos()+1].getIsWall() == false)
				{
					tempMaze[player.getrPos()][player.getcPos()+1].setIsRevealed(true);
					tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
					tempMaze[player.getrPos()][player.getcPos()+1].setHasPlayer(true);
					player.setC(player.getcPos()+1);
					System.out.println("You moved right by one block");
				}
			}
			
		}
		
		else if(userInput.equals("left"))
		{
			if(player.getcPos()<=0)
			{
				if(tempMaze[player.getrPos()][player.getcPos()-1].getIsWall())
					{
						tempMaze[player.getrPos()][player.getcPos()].setIsRevealed(true);
						System.out.println("You ran into a wall... maybe try again?");
			
					}
				else if(!tempMaze[player.getrPos()][player.getcPos()-1].getIsWall())
					{
						tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
						player.setC(player.getcPos()-1);
						tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(true);
						System.out.println("You moved left by one block.");
					
					}
			}
		}
				
		else if(userInput.equals("up"))
		{
			if(player.getrPos()<=0)
			{
				if(tempMaze[player.getcPos()-1][player.getrPos()].getIsWall() == true)
				{
					tempMaze[player.getcPos()-1][player.getrPos()].setIsRevealed(true);
					System.out.println("You ran into a wall... maybe try again?");
				}
				
				else if(tempMaze[player.getcPos()-1][player.getrPos()].getIsWall() == false)
				{
					tempMaze[player.getrPos()-1][player.getcPos()].setIsRevealed(true);
					tempMaze[player.getcPos()][player.getrPos()].setHasPlayer(false);
					tempMaze[player.getcPos()-1][player.getrPos()].setHasPlayer(true);
					player.setR(player.getrPos()-1);
					System.out.println("You moved uo by one block.");
					
				}
			}
			
		}
		
		

		else if(userInput.equals("down"))
		{
			if (player.getrPos() >= 4)
			{
				System.out.println("Out of bounds !!");
			}
			
			else 
			{
				if(tempMaze[player.getrPos()+1][player.getcPos()].getIsWall())
				{
					tempMaze[player.getrPos()+1][player.getcPos()].setIsRevealed(true);
					System.out.println("You ran into a wall... maybe try again?");
					
				}
				else 
				{
					tempMaze[player.getrPos()+1][player.getcPos()].setIsRevealed(true);
					tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
					tempMaze[player.getrPos()+1][player.getcPos()].setHasPlayer(true);
					player.setR(player.getrPos()+1);
					System.out.println("you have moved up one block");
				}
			
			}
		}
		//this prints the maze game repeatedly
		Maze(tempMaze);
		
		//Checks ending
		if(player.getrPos() == 4 && player.getcPos() == 4)
		{
			System.out.println("Finally!!, You did it, you won!!!");
		}
		
		//Rests game
		else
		{
			moveonMaze(tempMaze, player);
		}
	}
	
}
