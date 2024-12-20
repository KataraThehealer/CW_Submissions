public class StringsLoops_Quiz_Corrections {

	/**
	 * My main method that declares what I am going to print backwards, in this case it would be "backward"
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print(printBackwards("backward"));
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String printBackwards(String str)
	{
		int length = str.length()-1;
		String backwardStr = "";
		/**
		 * The for loop begins at the last index and decrements the varible i
	 * until it reaches 0. During each step, the character at index i is added to backwardStr.
		 */
		for (int i = length; i >= 0; i--) 
		{
			backwardStr = backwardStr + (str.charAt(i));
		}
		
		return backwardStr;
	}

}
