
public class InvisMainChar {
	
	int rPos;
	int cPos;

	public InvisMainChar()
	{
		rPos = 0;
		cPos = 0;
	}
	
	public int[] getPos()
	{
		int[] pos = {rPos,cPos};
		return pos;
	}
	
	public void setR(int newR)
	{
		rPos = newR;
	}

	public void setC(int newC)
	{
		cPos = newC;
	}
	
	public int getrPos()
	{
		return rPos;
	}
	
	public int getcPos()
	{
		return cPos;
	}
}
