
public class MazeGameTile {
	
	boolean hasPlayer;
	boolean isRevealed;
	boolean isWall;

	public MazeGameTile(boolean hP, boolean isR, boolean isW)
	{
		hasPlayer = hP;
		isRevealed = isR;
		isWall = isW;
	}
		
		
	public void setHasPlayer(boolean newHP)
	{
		hasPlayer = newHP;
	}
	
	public void setIsRevealed(boolean newIsR)
	{
		isRevealed = newIsR;
	}
	
	public void setIsWall(boolean newIsWall)
	{
		isWall = newIsWall;
	}
	
	public boolean getHasPlayer()
	{
		return hasPlayer;
	}
	
	public boolean getIsRevealed()
	{
		return isRevealed;
	}
	
	public boolean getIsWall()
	{
		return isWall;
	}
	
	
	public String toString()
	{
		if(hasPlayer == true)
		{
			return " P ";
		}
		
		if(isRevealed == false)
		{
			return "*";	
		}
		
		else if(isRevealed == true)
		{
			if(isWall == true)
			{
				return " W ";
			}
			else if(isWall == false)
			{
				return "X";
			}
		}
			
	return "A";
	}
}
