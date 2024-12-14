public class Loops_Intro_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = "abqcdqefghqqijk";
		char x = 'q';
		System.out.println(countLetter(t,x));
		System.out.println(getFactor(5));
		System.out.println("aabcd");
		
		
	}
	//Question 1
	public static int countLetter(String str, char letters)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(letters == str.charAt(i))
			{
				count++;
			}
		}
		return count; 
	}
	
	//Question 2
	public static int getFactor(int count)
	{
		for(int i = count-1; i > 0; i = i-1)
		{
			count = count * i;
		}
		return count;
	}
	
	//Question 3 
	public static Boolean getIfRepeats(String str)
	{
		for(int i = 0; i < str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				return true;
			}
		}
		return false;
	}
	

}
